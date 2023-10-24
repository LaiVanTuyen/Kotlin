fun main(args: Array<String>) {
   val Tuyen = NhanVien("Lại Văn", "Tuyên", 620)
    val Tuan = NhanVien("Nguyễn Văn", "Tuấn", 220)

    println("Thông tin của Tuyên = ${Tuyen.Ho} - ${Tuyen.Ten}")
    println("Lương của Tuyên = ${Tuyen.getLuong()}")

    println("Thông tin của Tuấn = ${Tuan.Ho} - ${Tuan.Ten}")
    println("Lương của Tuấn = ${Tuan.getLuong()}")
}