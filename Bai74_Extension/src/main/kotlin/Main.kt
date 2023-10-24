fun Int.Cong(a:Int):Int
{
    return this+a
}
fun main(args: Array<String>) {
    var t=5.Cong(9)
    println("t=$t")
    var x1=9
    var x2=10
    var x3=x1.Cong(x2)
    println("x3=$x3")

}

