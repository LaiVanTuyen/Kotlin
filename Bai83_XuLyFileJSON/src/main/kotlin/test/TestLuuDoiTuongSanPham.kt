package test

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import model.SanPham
import java.io.File
import java.io.FileReader
import java.io.FileWriter

fun Luu1DoiTuong() {
    try {
        val sp = SanPham(1, "Coca colala", 15.0)
        val gson = Gson()
        val file = FileWriter("D:/Kotlin/Bai83_XuLyFileJSON/doituongsanpham_nhieu.json")
        gson.toJson(sp, file)
        file.close()
        println("Xuất Json thành công")
    } catch (ex: Exception) {
        ex.printStackTrace()
    }
}

fun LuuNhieuDoiTuong() {
    try {
        val dsSp: MutableList<SanPham> = mutableListOf()
        dsSp.add(SanPham(1, "Coca colala", 15.0))
        dsSp.add(SanPham(2, "Aquafina", 25.0))
        dsSp.add(SanPham(3, "Sting", 10.0))
        val gson = Gson()
        val file = FileWriter("D:/Kotlin/Bai83_XuLyFileJSON/doituongsanpham_nhieu.json")
        gson.toJson(dsSp, file)
        file.close()
        println("Xuất Json thành công")
    } catch (ex: Exception) {
        ex.printStackTrace()
    }
}

fun main(args: Array<String>) {
    LuuNhieuDoiTuong()
//    val gson=Gson()
//    val sp:SanPham=gson.fromJson(FileReader("d:/doituongsanpham.json"),
//            SanPham::class.java)
//    println(sp)
//
//    val dsSp:MutableList<SanPham> =gson.fromJson(
//            FileReader("d:/doituongsanpham_nhieu.json"),
//            object :TypeToken<MutableList<SanPham>>()
//            {}.type)
//    println("----------------")
//    for(sp in dsSp)
//        println(sp)
}