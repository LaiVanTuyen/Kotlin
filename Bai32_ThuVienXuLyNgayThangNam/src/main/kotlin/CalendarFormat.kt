import java.text.SimpleDateFormat
import java.util.Calendar

fun main() {
    val cal = Calendar.getInstance()
    println(cal.get(Calendar.YEAR))
    val date = cal.time
    println(date)
    val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    println(sdf.format(date))
}