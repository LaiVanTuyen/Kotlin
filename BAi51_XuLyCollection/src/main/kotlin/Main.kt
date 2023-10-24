fun main() {
    // create a new map
    val names = mapOf("John" to 25, "Mary" to 30, "Bob" to 20)

    // get the value associated with a key
    val johnAge = names["John"]

    // check if a key is present in the map
    val containsMary = names.containsKey("Mary")

    // print the map and the result of the contains check
    println("Names: $names")
    println("Contains Mary: $containsMary")
}
