package test

import io.JSonFileFactory
import model.DanhMuc
import model.SanPham

fun ThuLuuDanhMucVaSanPham()
{
    val dsDM : MutableList<DanhMuc> = mutableListOf()
    val nuocNgot=DanhMuc(1,"Nước Ngọt")
    nuocNgot.dsSp.add(SanPham(1,"Cocacola",15.0))
    nuocNgot.dsSp.add(SanPham(2,"Pepsi",25.0))
    nuocNgot.dsSp.add(SanPham(3,"Sting",10.0))

    dsDM.add(nuocNgot)

    val bia=DanhMuc(2,"Bia")
    bia.dsSp.add(SanPham(4,"Bia Ken",35.0))
    bia.dsSp.add(SanPham(5,"Bia Sài gòn đỏ",35.0))

    dsDM.add(bia)

    val ruou=DanhMuc(3,"Rượu")
    ruou.dsSp.add(SanPham(6,"Rượu Vodka Hà Nội",12.0))
    ruou.dsSp.add(SanPham(7,"Rượu Vang Đà Lạt",7.0))
    ruou.dsSp.add(SanPham(8,"Rượu Đế Amakông",67.0))

    dsDM.add(ruou)

    val jsFF=JSonFileFactory()
    val kq=jsFF.LuuDuLieu(dsDM,"D:/Kotlin/Bai84_BaiTapRenLuyenJSon/csdlSanPham.json")
    if(kq)
        println("Lưu Json Master-details thành công")
    else
        println("Sorry nha, lưu hok được thím ơi")

}
fun main(args: Array<String>) {
    ThuLuuDanhMucVaSanPham()

//    val dsDM = JSonFileFactory().DocDuLieu("D:/Kotlin/Bai84_BaiTapRenLuyenJSon/csdlSanPham.json")
//    println(dsDM)
}