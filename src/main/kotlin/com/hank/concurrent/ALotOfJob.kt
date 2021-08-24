package com.hank.concurrent

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.system.measureTimeMillis

fun main() {
    val threadTime = measureTimeMillis {
        (1..100000).forEach {
            Thread { }.start()
        }
    }
    val coroutinesTime = measureTimeMillis {
        (1..100000).forEach {
            GlobalScope.launch {
//                print(" ")
            }
        }
    }
    println(threadTime)
    println(coroutinesTime)
}