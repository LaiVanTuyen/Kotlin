import kotlin.random.Random

fun main(args: Array<String>) {
    val randomValues = List(10) { Random.nextInt(0, 100) }
// prints new sequence every time
    println(randomValues)

    val nextValues = List(10) { Random.nextInt(0, 100) }
    println(nextValues)
    println("randomValues != nextValues is ${randomValues != nextValues}")
}