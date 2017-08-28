import java.util.ArrayList

fun printArrayList(arrayList:ArrayList<String>) {
    for ((index, value) in arrayList.withIndex()) {
        println("$index = $value")
    }
}

fun main(args: Array<String>) {
    val arrayList = arrayListOf("10", "11", "1001")
    printArrayList(arrayList)
}