import java.util.Scanner

fun main(args: Array<String>) {
    val arr: Array<IntArray> = Array(3) { IntArray(3) }
    for (i in arr.indices){
        for (j in arr[i].indices) {
            arr[i][j] = Scanner(System.`in`).nextInt()
        }
    }
    println("The given array is:")
    for (i in arr.indices){
        for (j in arr[i].indices) {
            print("${arr[i][j]} ")
        }
        println()
    }
}