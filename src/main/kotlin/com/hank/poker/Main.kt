package com.hank.poker

fun main() {
/*    val CLUB = 1
    val DIAMOND = 2
    val HEART = 3
    val SPADE = 4*/
    //電腦的
    val c1 = Card(3, Face.CLUB) // 梅花3
//    c1.point = 5 //only getter method
//    c1.point = 3
//    c1.face = 1 //梅花
    //我的
    val c2 = Card(3, Face.DIAMOND) // 方塊3
    println(c1)
    println(c2)
    //假如, 加具有比較的能力
    println(c1 > c2)
}
//列舉
enum class Face (val value: Int) {
    CLUB(1), DIAMOND(2), HEART(3), SPADE(4)
}

data class Card (val point: Int, val face: Face) : Comparable<Card> {
    override fun compareTo(other: Card): Int {
        val diff = point - other.point
        return when(diff) {
            0 -> face.value - other.face.value
            else -> diff
        }
    }
}