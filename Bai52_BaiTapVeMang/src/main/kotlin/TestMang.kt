import java.util.*

fun main(args: Array<String>) {
    var n:Int?
    println("Nhập số phần tử của mảng:")
    n= readLine()?.toInt()
    if(n==null)return
    var M:IntArray =kotlin.IntArray(n)
    var rand=Random()
    for (i in M.indices)
        M[i]=rand.nextInt(100)
    println("Danh sách các phần tử trong mảng:")
    for (item in M)
        print("$item\t")
    var sum=M.sum()
    println("\nTổng mảng =$sum")
    println("Nhập k:")
    var k:Int?= readLine()?.toInt()
    if(k==null)return
    var dem=0
    for (item in M)
    {
        if(item==k)
            dem++
    }
    println("Số $k xuất hiện $dem lần")
    println("Phần tử lớn nhất =${M.max()}")
    println("Phần tử nhỏ nhất =${M.min()}")
    var dsNguyenTo=M.filter { x->
        var dem=0
        for (i in 1..x)
        {
           if(x%i==0)
               dem++
        }
        dem==2
    }
    println("Các số nguyên tố:")
    for (item in dsNguyenTo)
        print("$item\t")
    M.sort()
    println("\nDanh sách các phần tử tăng dần:")
    for (item in M)
        print("$item\t")
    M.sortDescending()
    println("\nDanh sách các phần tử giảm dần:")
    for (item in M)
        print("$item\t")
}