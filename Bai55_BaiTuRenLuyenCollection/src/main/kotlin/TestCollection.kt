fun printNumbers(vararg numbers: Int) {
    for (number in numbers) {
        println(number)
    }
}
fun main(args: Array<String>) {
    printNumbers(1)
    printNumbers(7,8)
    printNumbers(9,10,11,12)
}
