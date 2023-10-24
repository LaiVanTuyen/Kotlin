import java.lang.StringBuilder

fun kiemTraPanlynDrome(s:String):Boolean
{
    for(i in s.indices)
    {
        if(s[i]!=s[s.length-i-1])
            return false
    }
    return true
}
fun main(args: Array<String>) {
    var s="redeleveleder"
    var kt=kiemTraPanlynDrome(s)
    val a = StringBuilder(s)
    a.reverse()
    println("a=$a")
    if(kt)
    {
        println("$s là chuỗi panlyndrome")
    }
    else
    {
        println("$s Ko là chuỗi panlyndrome")
    }
}