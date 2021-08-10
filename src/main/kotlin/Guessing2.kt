package com.tom.guess

import java.net.URL
import java.util.*

fun main() {
    val secretNumber = SecretNumber()
    var num = 0
    var diff = -1
    while(diff != 0) {
        print("Please enter a number: ")
        var line = readLine()
        num = line?.toIntOrNull()?: 0
        diff = secretNumber.guess(num)
        if (diff > 0) {
            println("Smaller")
        } else if (diff < 0) {
            println("Bigger")
        } else {
            println("You got it")
        }
    }
    println("Times: ${secretNumber.counter}")
}

class SecretNumber {
    var counter = 0
    private var secret = Random().nextInt(10)+1
    fun guess(num: Int) : Int {
        counter++
        return num - secret
    }
}
