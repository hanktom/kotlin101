package com.hank

fun main() {
    val deck = mutableListOf<Int>()
    for (i in 0 until 52) {
        if (i%13 == 0 && i!=0) println()
        print("${(i+1)%13}")

        val type = if (i/13 == 0) "C"
            else if (i/13 == 1) "D"
            else if (i/13 == 2) "H"
                else "S"
//        print("$type ")
        val t = when(i/13) {
            0 -> "\u2663"
            1 -> "\u2662"
            2 -> "\u2661"
            else -> "\u2660"
        }
        print("$t ")

    }
}