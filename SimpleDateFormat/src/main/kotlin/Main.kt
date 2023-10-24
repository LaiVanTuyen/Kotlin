import java.text.*
import java.util.*


fun main(args: Array<String>) {
    val pdt =  SimpleTimeZone(-8 * 60 * 60 * 1000, "PST")
    pdt.setStartRule(Calendar.APRIL, 1, Calendar.SUNDAY, 2*60*60*1000)
    pdt.setEndRule(Calendar.OCTOBER, -1, Calendar.SUNDAY, 2*60*60*1000)
   val formatter =  SimpleDateFormat ("yyyy.MM.dd G 'at' hh:mm:ss a zzz")
    val currentTime_1 =  Date()
    val dateString:String = formatter.format(currentTime_1);
     val pos =  ParsePosition(0);
    val currentTime_2 = formatter.parse(dateString, pos);
    println(dateString)
    println(currentTime_2)

}