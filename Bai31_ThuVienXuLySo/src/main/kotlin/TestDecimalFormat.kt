import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.util.*

fun main(args: Array<String>) {
    var tien=32364727534534
    var dcf=DecimalFormat("#,####")
    var dcfs=DecimalFormatSymbols(Locale.getDefault())
    dcfs.groupingSeparator=','
    dcf.decimalFormatSymbols=dcfs
    println(tien)
    println(dcf.format(tien))
}