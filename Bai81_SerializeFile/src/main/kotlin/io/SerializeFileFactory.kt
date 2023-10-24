package io

import model.SanPham
import java.io.FileInputStream
import java.io.FileOutputStream

class SerializeFileFactory {
    public fun saveDateToFile(dsSp:MutableList<SanPham>,path:String):Boolean {
        try {
            val fos= FileOutputStream(path)
            val oos=java.io.ObjectOutputStream(fos)
            oos.writeObject(dsSp)
            oos.close()
            fos.close()
            return true
        }catch (ex:Exception) {
            ex.printStackTrace()
        }
        return false
    }

    public fun readDataFromFile(path:String):MutableList<SanPham>{
        var dsSp:MutableList<SanPham> = mutableListOf<SanPham>()
        try {
            var fis= FileInputStream(path)
            var ois=java.io.ObjectInputStream(fis)
            var data = ois.readObject()
            dsSp = data as MutableList<SanPham> // ép kiểu
            ois.close()
            fis.close()
        }catch (ex:Exception) {
            ex.printStackTrace()
        }
        return dsSp
    }
}