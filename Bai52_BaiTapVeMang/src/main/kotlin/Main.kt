import kotlin.random.Random

fun main(args: Array<String>) {
    println("Nhập số phần tử của mảng:")
    val n: Int = readlnOrNull()?.toInt() ?: return
    val M: IntArray = IntArray(n) { Random.nextInt(100) }
    println("Danh sách các phần tử trong mảng:")
    M.forEach { print("$it\t") }
    println("Sum = ${M.sum()}")
    println("Nhập k:")
    val k:Int = readlnOrNull()?.toInt() ?: return
    println("So $k xuat hien ${M.count { it == k }} lan")
    println("Phần tử lớn nhất = ${M.max()}")
    println("Phần tử nhỏ nhất = ${M.min()}")
    val dsSoNguyenTo = M.filter{x ->
        var dem = 0
        for (i in 1..x) {
            if (x % i == 0)
                dem++
        }
        dem == 2
    }
    println("Các số nguyên tố:")
    dsSoNguyenTo.forEach { print("$it\t") }
    println("\nDanh sách các phần tử tăng dần: ${M.sorted()}")
    println("Danh sách các phần tử giảm dần: ${M.sortedDescending()}")
}