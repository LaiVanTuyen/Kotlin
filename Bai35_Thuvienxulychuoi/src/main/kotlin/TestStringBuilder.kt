fun main(args: Array<String>) {
    var sb=StringBuilder("Obama")
    println(sb.toString())
    sb.append(" ")
    sb.append("Putin")
    println(sb.toString())
    sb.insert(6,"Kim")
    println(sb.toString())
    sb.delete(3,8)
    println(sb.toString())
    sb.reverse()
    println(sb.toString())
}