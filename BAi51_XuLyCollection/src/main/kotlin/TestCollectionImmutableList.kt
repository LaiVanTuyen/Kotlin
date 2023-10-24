fun main(args: Array<String>) {
    var ds:List<Int> = listOf(6,7,8,-10,2,-3)
    for (i in ds.indices)
        print("${ds[i]}\t")
    var dsChan=ds.filter { x->x%2==0 }
    println("\nCác số chẵn:")
    for (i in dsChan.indices)
        print("${dsChan[i]}\t")

//    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)
//    val anotherMap = mapOf("key2" to 2, "key1" to 1, "key4" to 1, "key3" to 3)
//
//    println("The maps are equal: ${numbersMap == anotherMap}")

    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)

    println("All keys: ${numbersMap.keys}")
    println("All values: ${numbersMap.values}")
    if ("key2" in numbersMap) println("Value by key \"key2\": ${numbersMap["key2"]}")
    if (1 in numbersMap.values) println("The value 1 is in the map")
    if (numbersMap.containsValue(1)) println("The value 1 is in the map") // same as previous

}