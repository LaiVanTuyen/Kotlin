package io

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import model.DanhMuc
import java.io.FileReader
import java.io.FileWriter

class JSonFileFactory {
    public fun LuuDuLieu(dsSp:MutableList<DanhMuc>,path:String):Boolean
    {
        try {
            val gs=Gson()
            val fileWriter=FileWriter(path)
            gs.toJson(dsSp,fileWriter)
            fileWriter.close()
            return true
        }
        catch (ex:Exception)
        {
            ex.printStackTrace()
        }
        return false
    }
    public fun DocDuLieu(path:String):MutableList<DanhMuc>
    {
        var dsSp:MutableList<DanhMuc> = mutableListOf()
        try
        {
            val gson=Gson()
            val fileReader=FileReader(path)
            dsSp=gson.fromJson(fileReader,
                    object :TypeToken<MutableList<DanhMuc>>()
                    {}.type
                    )
            fileReader.close()
        }
        catch (ex:Exception)
        {
            ex.printStackTrace()
        }
        return dsSp
    }
}