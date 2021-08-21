package com.hank.poker

import com.hank.Student

fun main() {
    val stu = Student("001", "Jack").also {
        it.english = 60
        it.math = 90
    }
    //
    val eric = Student("002", "Eric").apply {
        english = 75
        math = 80
    }

    //








}