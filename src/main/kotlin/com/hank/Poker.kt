package com.hank

fun main() {
    val set = mutableSetOf<Int>()
    set.add(3)
    set.add(5)
    set.add(1)
    set.add(3)
    println(set)
    set.forEach {
        println(it)
    }
    //Map
    val map = mapOf<Int,String>(
        0 to "星期日",
        1 to "星期一",
        2 to "星期二",
        3 to "星期三",
        4 to "星期四",
        5 to "星期五",
        6 to "星期六")
    println(map.get(2))
    val parkingLot = mutableMapOf<String, Car>()
    parkingLot.put(
        "ABC-1234",
        Car("ABC-1234", System.currentTimeMillis()))
//    map.put(7, "NON")
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

data class Car(val id: String, val enter: Long, val leave: Long = 0)