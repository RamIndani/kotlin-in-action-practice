package com.kotlin.practice.chapter3

import java.util.*

/**
 * Created by ramnivasindani on 8/28/17.
 */

fun <T> joinToString(collection: Collection<T>,
                 seperator: String,
                 prefix: String,
                 postfix: String) : String {
    var builder = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) {
            builder.append(seperator)
        }
        builder.append(element)
    }
    builder.append(postfix)
    return builder.toString()
}

fun main(args: Array<String>) {
    println(joinToString(listOf(1,2,3,4), seperator="|", prefix = "{", postfix = "}"))
}