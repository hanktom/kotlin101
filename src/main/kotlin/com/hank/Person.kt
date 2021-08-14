package com.hank

fun main() {

    val weight = 65;
    val height = 1.7f
    val bmi = weight / (height * height)
    println(bmi)

    val p = Person(65f, 1.7f)
//    p.weight = 65f
//    p.height = 1.7f
    println(p.bmi())
    p.weight = 64f
    println(p.bmi())
}

class Person (var weight:Float, val height:Float){ //Primary constructor
    //Secondary constructor
    constructor() : this(0f, 0f)
    constructor(name: String) : this() {
        this.name = name
    }
    //    String name;
    var name:String? = null
    //public void hello() { .. }
    fun hello() {
        println("Hello Kotlin from Person")
    }
    fun bmi() : Float {
        return weight / (height * height)
    }
}