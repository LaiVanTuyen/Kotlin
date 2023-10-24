fun main(args: Array<String>) {
    var s="SV001;Hồ Văn Đồ;hodo@gmail.com"
    var arr=s.split(";")
    println("Số phần tử trong danh sách =${arr.size}")
    for (item in arr)
        println(item)
}