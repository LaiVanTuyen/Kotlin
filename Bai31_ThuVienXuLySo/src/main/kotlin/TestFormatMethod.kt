fun main() {
    println("Nhập toán:")
    val toan:Double? = readlnOrNull()?.toDouble()
    println("Nhập Lý:")
    val ly:Double? = readlnOrNull()?.toDouble()
    println("Nhập hóa:")
    val hoa:Double? = readlnOrNull()?.toDouble()
    if(toan==null || ly==null|| hoa==null)
        return
    val dtb=(toan+ly+hoa)/3
    println("Điểm trung bình = $dtb")
    val dtbFormat="%.3f".format(dtb)
    println("Điểm trung bình = $dtbFormat")
}