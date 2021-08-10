package com.tom

fun main() {
    //mutable
    //immutable
//    val data = mutableListOf<Int>(5,2,7,9,1)
    var data = mutableListOf<Int>(5,2,7,9,1)
//    data.add(8)
//    data.remove(5)
    println(data.get(2))
    println(data.sorted().reversed())
    println(data)
    //練功
    //5,2,7,9,1
    for (i in 0..data.size-2) {
        for (j in i+1..data.size-1) {
            if (data[i] > data[j]) {
                val tmp = data[i]
                data[i] = data[j]
                data[j] = tmp
            }
        }
    }
    println(data)
}