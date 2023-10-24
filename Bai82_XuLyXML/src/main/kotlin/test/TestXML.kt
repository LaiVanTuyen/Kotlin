package test

import io.XMLFileFactory
import model.SanPham

fun ThuLuuXML()
{
    val dsSp:MutableList<SanPham> = mutableListOf()
    dsSp.add(SanPham(1,"Coca",15.5))
    dsSp.add(SanPham(2,"Aquafina",25.0))
    dsSp.add(SanPham(3,"Pepsi",10.5))
    dsSp.add(SanPham(4,"Sting",13.5))
    dsSp.add(SanPham(5,"Redbull",9.5))

    val xmlFF=XMLFileFactory()
    val kq=xmlFF.LuuDuLieu(dsSp,"D:/Kotlin/Bai82_XuLyXML/dulieusanpham.xml")
    println(if (kq) "Lưu XML thành công" else "Lưu XML thất bại")
}
fun main(args: Array<String>) {
    ThuLuuXML()
//    val xmlFF=XMLFileFactory()
//    val dsSp=xmlFF.DocDuLieu("D:/Kotlin/Bai82_XuLyXML/dulieusanpham.xml")
//    for (sp in dsSp)
//        println(sp)
}