//import java.util.*
//
//fun Int.Cong(a:Int):Int
//{
//    return this+a
//}
//fun Int.LaNguyenTo():Boolean
//{
//    var dem=0
//    for(i in 1..this)
//    if(this %i==0)
//        dem++
//    return dem==2
//}
//fun SinhVien.Tuoi():Int
//{
//    var calNow=Calendar.getInstance()
//    var yearNow=calNow.get(Calendar.YEAR)
//    calNow.time=this.namSinh
//    var yearBirth=calNow.get(Calendar.YEAR)
//    return  yearNow-yearBirth
//}
//fun main(args: Array<String>) {
//    var a=5.Cong(9)
//    println(a)
//    if(7.LaNguyenTo())
//        println("7 là số nguyên tố")
//
//    var x=9
//    if(x.LaNguyenTo())
//        println("$x là số nguyên tố")
//    else
//        println("$x Ko là số nguyên tố")
//    var cal=Calendar.getInstance()
//    cal.set(Calendar.YEAR,1990)
//    cal.set(Calendar.MONTH,11)
//    cal.set(Calendar.DAY_OF_MONTH,20)
//    var teo=SinhVien(cal.time)
//
//    println("Tuổi của Tèo ${teo.Tuoi()}")
//}