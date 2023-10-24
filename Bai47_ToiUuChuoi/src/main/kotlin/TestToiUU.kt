import java.util.*

fun ToiUU(s:String):String
{
    var sTam=s.trim()
    var dsWord=sTam.split(" ")
    var sToiUu=""
    for (word in dsWord)
    {
        if(word.length>0)
        {
            var wordMoi= word.lowercase(Locale.getDefault())
            wordMoi=wordMoi.replaceFirst(wordMoi[0]+"", (wordMoi[0]+"").uppercase(Locale.getDefault()))
            sToiUu+=wordMoi+" "
        }
    }
    return  sToiUu.trim()
}
fun main(args: Array<String>) {
    var ten="   TRẦN   dUY     THAnh   "
    var ten2=ToiUU(ten)
    println(ten2)
}