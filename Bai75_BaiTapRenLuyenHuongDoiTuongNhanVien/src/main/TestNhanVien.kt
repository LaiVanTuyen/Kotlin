fun main(args: Array<String>) {
    var teo=NhanVien("Nguyễn Văn","Tèo",620)
    var ty=NhanVien("Trần Văn","Tý",220)

    println("Thông tin của Tèo ="+teo.Ho+"-"+teo.Ten)
    println("Lương của Tèo ="+teo.getLuong())

    println("Thông tin của Tý ="+ty.Ho+"-"+ty.Ten)
    println("Lương của Tý="+ty.getLuong())
}