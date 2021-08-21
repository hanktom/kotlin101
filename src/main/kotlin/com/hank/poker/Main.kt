package com.hank.poker

fun main() {
    //電腦的
    val c1 = Card(3, 1) // 梅花3
//    c1.point = 5 //only getter method
//    c1.point = 3
//    c1.face = 1 //梅花
    //我的
    val c2 = Card(3, 2) // 方塊3
    println(c1)
    println(c2)
    //假如, 加具有比較的能力
    println(c1 > c2)
}

data class Card (val point: Int, val face: Int) : Comparable<Card> {
    override fun compareTo(other: Card): Int {
        val diff = point - other.point
        return when(diff) {
            0 -> face - other.face
            else -> diff
        }
    }
}