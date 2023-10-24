import java.util.*

fun choi()
{
    var rd=Random()
    var soMay=rd.nextInt(101)
    var soLanDoan=0
    println("Máy đã ra 1 số trong đoạn [0..100]!")
    while (true)
    {
        println("Mời bạn đoán số:")
        var soNguoi= readLine()?.toInt()
        if(soNguoi==null)break
        soLanDoan++
        println("Bạn đoán lần thứ $soLanDoan")
        if(soNguoi==soMay)
        {
            println("Chúc mừng! bạn đã đoán đúng số của máy = $soMay")
            break
        }
        else if(soNguoi>soMay)
            println("Bạn đoán sai, số của máy < số của bạn")
        else if(soNguoi<soMay)
            println("Bạn đoán sai, số của máy > số của bạn")
        if(soLanDoan>=7)
        {
            println("Game Over!")
            break
        }
    }

}
fun main(args: Array<String>) {
    while (true)
    {
        choi()
        println("Chơi nữa không thím?(c/k):")
        var kq= readLine()
        if(kq?.compareTo("k",true)==0)
            break
    }
    println("Cám ơn bạn đã chơi Game!")
}