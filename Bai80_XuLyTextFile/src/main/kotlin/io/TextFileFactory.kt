package io

import model.NhanVien
import java.io.*
import java.text.SimpleDateFormat

class TextFileFactory {
    private var sdf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS")
    public fun saveData(dsNV:MutableList<NhanVien>, path: String):Boolean{
        try {
            val fos = FileOutputStream(path)
            val osw = OutputStreamWriter(fos,"UTF-8")
            val bfw = BufferedWriter(osw)
            for (nv in dsNV){
                val line="${nv.Ma};${nv.Ten};${sdf.format(nv.NamSinh)}"
                bfw.write(line)
                bfw.newLine()
            }
            bfw.close()
            osw.close()
            fos.close()
            return true
        }catch (ex:Exception){
            ex.printStackTrace()
            return false
        }
    }

    public fun readData(path: String):MutableList<NhanVien>{
        val dsNV:MutableList<NhanVien> = mutableListOf()
        try {
            val fis = FileInputStream(path)
            val isr = InputStreamReader(fis,"UTF-8")
            val bfr = BufferedReader(isr)
            var line = bfr.readLine()
            while(line!=null){
                val arr = line.split(";")
                if (arr.size==3){
                    val nv:NhanVien = NhanVien()
                    nv.Ma = arr[0].toInt()
                    nv.Ten = arr[1]
                    nv.NamSinh = sdf.parse(arr[2])
                    dsNV.add(nv)
                }
                line=bfr.readLine()
            }
            bfr.close()
            isr.close()
            fis.close()
        }catch (ex:Exception){
            ex.printStackTrace()
        }
        return dsNV
    }
}