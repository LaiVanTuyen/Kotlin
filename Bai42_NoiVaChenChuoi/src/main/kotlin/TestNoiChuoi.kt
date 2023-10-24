fun main(args: Array<String>) {
    var s="Nguyễn Thị"
    s=s.plus(" ")
    s=s.plus("Tủn")
    println(s)

    var s1="Trần Thị"
    s1=s1+" "
    s1=s1+"Tẹt"
    println(s1)

    val builder = StringBuilder()
    builder.append("Nguyễn Thị")
    builder.append(" ")
    builder.append("Tủn")
    val result = builder.toString()
    println(result)
}