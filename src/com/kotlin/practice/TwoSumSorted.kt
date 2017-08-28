package com.kotlin.practice

/**
 * Created by ramnivasindani on 8/13/17.
 */
    val inputsArray: IntArray = intArrayOf(2, 7, 11, 15)
    fun main(args: Array<String>) {
        findSumOfSortedArray(17, inputsArray)
    }

    fun findSumOfSortedArray( sum : Int, inputArray : IntArray) {
        var counter1: Int = 0
        var counter2: Int = inputArray.size -1
        while (counter1 < inputArray.size) {
            while (counter2 >= 0){
                if (inputArray[counter1]+inputArray[counter2] == sum) {
                    print ("Index1=$counter1 and Index2=$counter2")
                    break;
                } else if (inputArray[counter1] + inputArray[counter2] > sum) {
                    counter2--
                } else {
                    counter1++
                }
            }
            break;
        }
    }