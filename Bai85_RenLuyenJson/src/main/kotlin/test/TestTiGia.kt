package communityuni.com.test

import com.google.gson.Gson
import model.TiGia
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

fun main(args: Array<String>) {
    var url:URL = URL("https://www.dongabank.com.vn/exchange/export")
    var connection:HttpURLConnection =url.openConnection() as HttpURLConnection
    var isr:InputStreamReader = InputStreamReader(connection.inputStream,"UTF-8")
    var br=BufferedReader(isr)
    var data=br.readText()
    br.close()
    isr.close()
    data=data.replace("(","")
    data=data.replace(")","")
    var gson=Gson()
    var tg:TiGia = gson.fromJson(data,TiGia::class.java)
    for (item in tg.items) {
        println(item)
        println("--------------------------------")
    }
}