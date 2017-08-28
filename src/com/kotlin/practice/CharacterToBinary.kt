
import java.util.TreeMap
fun main(args: Array<String>) {
    printBinary()
}
fun printBinary() {
    val binary = TreeMap<Char, String>()
    for (char in 'A'..'Z') {
        val binaryVal = Integer.toBinaryString(char.toInt())
        binary[char] = binaryVal
    }

    for ((char,binaryVal) in binary) {
        println ("$char = $binaryVal")
    }
}