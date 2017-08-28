package com.kotlin.practice

/**
 * Created by ramnivasindani on 8/27/17.
 */

fun recognize(input: Char) = when (input)
{
    in '0'..'9' -> "It's digit"
    in 'A'..'Z', in 'a'..'z' -> "it's alphabet"
    else -> "un-recognizable"
}

fun main(args: Array<String>) {
    println(recognize('c'))
    println(recognize('5'))
    println(recognize('*'))
}