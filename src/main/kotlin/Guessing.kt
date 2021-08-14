package com.tom.guess

import com.hank.Person
import java.util.*

fun main() {
    //亂數
    val r = Random()
    val secret = r.nextInt(10)+1
    println(secret)
//    val person = Person(0f, 0f)
//    person.name = "Jack"
    val small = 1
    val big = 10
    var num = 0
    var counter = 0
    while (num != secret) {
        print("Please enter a number($small-$big):")
        var line = readLine()
    //    line = null
    //    println(line?.length)
        //Elvis operator
        num = line?.toIntOrNull()?: 0
//        println("Hi, ${person.name}, The number you entered is $num")
        if (num < secret) {
            println("Bigger")
        } else if (num > secret){
            println("Smaller")
        } else {
            println("Your got it")
        }
        counter++
    }
    println("Times: $counter")
}

class Guessing {
}

fun big(a:Int , b: Int): Int {
    var bigger = a
    if (bigger < b){
        bigger = b
    }
    return bigger
}