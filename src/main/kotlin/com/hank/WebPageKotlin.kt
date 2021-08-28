package com.hank

import org.jsoup.Jsoup
import java.lang.StringBuilder
import java.net.URL

fun main() {
    val sb = StringBuilder()
    val html = URL("https://developer.android.com/kotlin")
        .openStream()
        .bufferedReader()
        .lines().forEach { line ->
            println(line)
            sb.append(line)
        }

//    val html = URL("https://developer.android.com/kotlin")
//        .readText()
    //val json = "https://developer.android.com/kotlin".readWebPage()
    //解析
    //
}

fun String.readWebPage() : String {

    return "aaaa"
}