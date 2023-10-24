fun chuoi(){
    val sb = StringBuilder("String Builder")
    println(sb.toString())
    sb.insert(6, "Java ")
    println(sb.toString())
    sb.append(" Kotlin")
    println(sb.toString())
    sb.reverse()
    println(sb.toString())
}

fun main(args: Array<String>) {
   chuoi()
}