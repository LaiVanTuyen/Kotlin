import io.SerializeFileFactory
import model.SanPham

fun saveData(){
    val dsSp:MutableList<SanPham> = mutableListOf<SanPham>()
    dsSp.add(SanPham(1,"sp1",10.0))
    dsSp.add(SanPham(2,"sp2",20.0))
    dsSp.add(SanPham(3,"sp3",30.0))
    dsSp.add(SanPham(4,"sp4",40.0))
    dsSp.add(SanPham(5,"sp5",50.0))

    var sff = SerializeFileFactory()
    var kq = sff.saveDateToFile(dsSp,"D:/Kotlin/Bai81_SerializeFile/sanpham.txt")
    if(kq==true) {
        println("Lưu file thành công")
    }else {
        println("Lưu file thất bại")
    }
}

fun main() {
    //saveData()
    var sff = SerializeFileFactory()
    var dsSp = sff.readDataFromFile("D:/Kotlin/Bai81_SerializeFile/sanpham.txt")
    for(sp in dsSp) {
        println(sp)
    }
}