
fun main(arg: Array<String>) {
    val numberSet = setOf(1,10.7)
    val numberMap = mapOf(1 to "One", 2 to "Two", 3 to "Three")
    val numberList = listOf(1,19,10)

    println(numberSet.javaClass)
    println(numberMap.javaClass)
    println(numberList.javaClass)

}