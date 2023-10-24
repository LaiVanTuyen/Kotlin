import java.util.Scanner

fun main() {
    val arr = IntArray(5)

    for (i in arr.indices) {
        arr[i] = readlnOrNull()?.toInt() ?: 0
    }
    println(arr.count { x->x%2!=0 })
    val dsChan= arr.filter { x->x%2==0 }
    println("Các số chẵn:")
    for (i in dsChan)
        print("$i\t")


}