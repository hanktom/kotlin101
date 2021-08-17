package com.hank

fun main() {
    val deck = mutableListOf<Int>()
    for (i in 0 until 52) {
        deck.add(i)
    }
    printDeck(deck)
    println("------------------------------------")
//    deck.shuffle()
    printDeck(deck)
    var card1 = deck[(0..51).shuffled().first()]
    var card2 = deck[(0..51).shuffled().first()]
    val c1 = 3
    var c2 = 6

}

fun printDeck(deck : List<Int>) {
    var counter = 0
    for (i in deck) {
//        if (i % 13 == 0 && i != 0) println()
        print("${i % 13 + 1}")
        val type = if (i / 13 == 0) "C"
        else if (i / 13 == 1) "D"
        else if (i / 13 == 2) "H"
        else "S"
//        print("$type ")
        val t = when (i / 13) {
            0 -> "\u2663"
            1 -> "\u2662"
            2 -> "\u2661"
            else -> "\u2660"
        }
        print("$t ")
        counter++
        if ((counter)%13 == 0) println()
    }
}