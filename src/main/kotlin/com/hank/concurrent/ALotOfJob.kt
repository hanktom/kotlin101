package com.hank.concurrent

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.system.measureTimeMillis

fun main() {
    val threadTime = measureTimeMillis {
        (1..100000).forEach {
            Thread {
                Thread.sleep(100)
            }.start()
        }
    }
    //Suspend vs Pause = > 暫停?
    val coroutinesTime = measureTimeMillis {
        (1..100000).forEach {
            GlobalScope.launch {
//                print(" ")
                delay(100)
            }
        }
    }
    println(threadTime)
    println(coroutinesTime)
}

suspend fun buy() : String{

    return "ABC"
}
