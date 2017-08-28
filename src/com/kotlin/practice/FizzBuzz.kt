

fun fizzBuzz (number: Int) = when
{
    number % 15 == 0 -> "FizzBuzz "
    number % 3 == 0 -> "Fizz "
    number % 5 == 0 -> "Buzz "
    else -> "$number "
}

fun main (args: Array<String>) {
   /* for (number in 1..100) {
        print (fizzBuzz(number))
    }*/

    /*for (number in 100 downTo 1 step 2) {
        print ( " $number")
    }*/

    for (number in 0 until 100) {
        print (" $number")
    }
}