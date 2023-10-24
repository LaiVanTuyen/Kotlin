fun main(args: Array<String>) {
    var s="Nguyễn Thị Long Lành Chòng Chành Ánh Tuyết"
    var i1=s.indexOf("u")
    println(i1)
    var i2=s.lastIndexOf("u")
    println(i2)
    var kq=s.contains("long",true)
    if(kq)
        println(" ${kq} Có long trong chuỗi")
    else
        println("KO Có long trong chuỗi")
}