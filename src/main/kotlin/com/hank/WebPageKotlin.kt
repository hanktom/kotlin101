package com.hank

import java.net.URL

fun main() {
    val html = URL("https://developer.android.com/kotlin")
        .openStream()
        .bufferedReader()
        .lines().forEach { line ->
            println(line)
        }
    //val json = "https://developer.android.com/kotlin".readWebPage()
    //解析
    //
}

fun String.readWebPage() : String {

    return "aaaa"
}