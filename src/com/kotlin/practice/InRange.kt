package com.kotlin.practice

/**
 * Created by ramnivasindani on 8/27/17.
 */

fun isChar(c: Char) = c in 'A'..'Z' || c in 'a'..'z'


fun notDigit(c: Char) = c !in '0'..'9'


fun main(args: Array<String>) {
    print ("is char ${isChar('k')}" )
}