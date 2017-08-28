
fun checkIfNumber(input: String) : Int? {
    try {
        return input.toInt()
    } catch (nfEception: NumberFormatException) {
        return null
    } finally {
        println ("No resources to close here!")
    }
}

fun main(args: Array<String>) {
    //println (checkIfNumber("1"))
    //println (checkIfNumber("("))
    printNumber("3")
    printNumber("A")
}

fun printNumber(inputString: String) {
    val number =
        try {
            inputString.toInt()
        } catch (nfException: NumberFormatException) {
            return
        }

    println ("number is $number")
}