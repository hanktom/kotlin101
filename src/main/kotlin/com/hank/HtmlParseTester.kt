package com.hank

import org.jsoup.Jsoup

fun main() {
    val doc = Jsoup.connect("https://developer.android.com/kotlin")
        .get()
    val elements = doc.select(".devsite-wrapper")
    //Crawler
    elements.forEach {
        println(it.text())
    }
}