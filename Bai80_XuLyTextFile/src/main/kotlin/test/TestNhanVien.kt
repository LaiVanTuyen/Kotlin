package test

import io.TextFileFactory
import model.NhanVien
import java.util.Calendar

fun saveData(){
    val dsNV:MutableList<NhanVien> = mutableListOf()
    val cal = Calendar.getInstance()
    cal.set(1999,Calendar.JANUARY,1)
    val nv1 = NhanVien(1,"Nguyen Van A",cal.time)
    dsNV.add(nv1)
    cal.set(2000,Calendar.FEBRUARY,2)
    val nv2 = NhanVien(2,"Nguyen Van B",cal.time)
    dsNV.add(nv2)
    cal.set(2001,Calendar.MARCH,3)
    val nv3 = NhanVien(3,"Nguyen Van C",cal.time)
    dsNV.add(nv3)

    val tff: TextFileFactory = TextFileFactory()
    val kq= tff.saveData(dsNV,"D:/Kotlin/Bai80_XuLyTextFile/nhanvien.txt")
    if (kq)
        println("Đã lưu file thành công")
    else
        println("Lưu file thất bại")

}
fun main() {
    //saveData()
    val tff: TextFileFactory = TextFileFactory()
    val dsNV = tff.readData("D:/Kotlin/Bai80_XuLyTextFile/nhanvien.txt")
    for (nv in dsNV){
        println(nv)
    }
}