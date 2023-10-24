import java.util.*

fun main(args: Array<String>) {
    var M:Array<IntArray> = Array(10,{IntArray(5)})
    var rand=Random()
    for(i in M.indices)
    {
        for(j in M[i].indices)
        {
            M[i][j]=rand.nextInt(100)
        }
    }
    println("Mảng 2 chiều:")
    for(i in M.indices)
    {
        for(j in M[i].indices)
        {
            print("${M[i][j]}\t")
        }
        println()
    }
}