package com.kotlin.practice

/**
 * Created by ramnivasindani on 8/16/17.
 */

    val inputArray : Array<Int> = arrayOf(2,11,7,9)
    fun main (args : Array<String>) {
        print(findSum(inputArray, 9))
    }

    fun findSum (inputArray : Array<Int>,  sum: Int) : String {
        var output: String = ""
        var inputMap: MutableMap<Int, Int> = mutableMapOf();

        for (input in inputArray) {
            if (inputMap.containsKey(input)) {
                return "elements found"
            } else {
                inputMap.put(sum - input, input)
            }
        }
        return "elements not found"
    }