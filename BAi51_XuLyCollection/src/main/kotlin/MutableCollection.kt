
fun List<String>.getShortWordsTo(shortWords: MutableList<String>, maxLength: Int) {
    this.filterTo(shortWords) { it.length <= maxLength }
    // throwing away the articles
    val articles = setOf("a", "A", "an", "An", "the", "The")
    shortWords -= articles
}

fun main() {
    val words = "A long time ago in a galaxy far far away".split(" ")
    val shortWords = mutableListOf<String>()
    words.getShortWordsTo(shortWords, 4)
    println(shortWords)


//    val numbers = listOf("one", "two", "three", "four")
//    println("Number of elements: ${numbers.size}")
//    println("Third element: ${numbers.get(2)}")
//    println("Fourth element: ${numbers[3]}")
//    println("Index of element \"two\" ${numbers.indexOf("two")}")

    val numbers = mutableListOf("one", "two", "three", "four")

//    numbers.sort()
//    println("Sort into ascending: $numbers")
//    numbers.sortDescending()
//    println("Sort into descending: $numbers")

//    numbers.sortBy { it.length }
//    println("Sort into ascending by length: $numbers")
//    numbers.sortByDescending { it.last() }
//    println("Sort into descending by the last letter: $numbers")
//
    numbers.sortWith(compareBy<String> { it.length }.thenBy { it })
    println("Sort by Comparator: $numbers")
//
//    numbers.shuffle()
//    println("Shuffle: $numbers")

//    numbers.reverse()
//    println("Reverse: $numbers")

    val numbers1 = setOf(1, 2, 3, 4)  // LinkedHashSet is the default implementation
    val numbersBackwards = setOf(4, 3, 2, 1)

    println(numbers1.first() == numbersBackwards.first())
    println(numbers1.first() == numbersBackwards.last())
}