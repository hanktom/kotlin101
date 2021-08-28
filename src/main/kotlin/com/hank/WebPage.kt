package com.hank

import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.URL

fun main() {
    val url = URL("https://developer.android.com/kotlin")
    val urlConnection = url.openConnection()
    val input = urlConnection.getInputStream()
    //InputStream
    //BufferedReader
    val bufferReader = BufferedReader(InputStreamReader(input))
    var line = bufferReader.readLine()
    while(line != null) {
        println(line)
        line = bufferReader.readLine()
    }
    /*(0..100).forEach {
        val data = input.read()
        print(data.toChar())
    }*/
}