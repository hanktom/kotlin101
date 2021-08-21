package com.hank.concurrent

fun main() {
    println(Thread.currentThread())
    val runnable = Runnable {
        println("Hello")
        println(Thread.currentThread())

    }
    val startTime = System.currentTimeMillis()
    for (i in 0..300) {
        Thread(runnable).start()
    }
    val endTime = System.currentTimeMillis()
    println(endTime - startTime)
    /*Thread {
        println(Thread.currentThread())
        for (i in 0..4) {
            println("Hello 2")
            Thread.sleep(500)
        }
    }.start()*/
    println("Main end")
}

