package com.hank

import java.io.File

//學生有學號、姓名、英文、數學成績
//1) 印出學生
//1.5) 成績可以後給
//2) 學生平均
//3) 平均的等級A,B,C,D,F
//4) 找出英文成績優秀 >=90
fun main() {
    val students = listOf<Student>(
        Student("001","Jack", 70, 90),
        Student("004", "Hank"),
        Student("005", "Jane", 90, 95))
    /*for (i in 0..2) {
        students.get(i).print()
    }*/
    for (stu in students) {
        //stu.print()
        if (stu.english >= 90) println(stu.name)
    }
    //Stream API
    println("------------------------------------")
    //Kotlin is a object-oriented & FUNCTIONAL language
    //Sequence
    val eng = students.filter { it.english >= 90 }    //Sequence<Student>
        .map { it.name }
        .toList()
    println(eng)
//    eng.forEach { it.print() }
    println("------------------------------------")
    students.forEach { student ->
        student.print()
        student.expire()
    }


}
//Extension function
fun String.haha() {

}

fun Student.expire() {

}


class Student(val id:String,
              val name:String,
              var english:Int = 0, var math:Int = 0) {
    //constructor(id:String, name:String) : this(id, name, 0, 0)
    fun print() {
        println("$id\t$name\t$english\t$math\t${average()}\t${grade2()}")
    }

    fun grade() : String {
     /*   val grade = if (average() >= 90) "A"
        else if (average() >= 80 && average() < 90) "B"
        else if (average() >= 70 && average() < 80) "C"
        else if (average() >= 60 && average() < 70) "D"
        else "F"*/
        /*val grade = when(average()) {
            in 90..100 -> "A"
            in 80..89 -> "B"
            in 70..79 -> "C"
            in 60..69 -> "D"
            else -> "F"
        }*/
        val grade = when(average()/10) {
            in 9..10 -> "A"
            8 -> "B"
            7 -> "C"
            6 -> "D"
            else -> "F"
        }
        return grade
    }

    fun grade2() = when(average()/10) {
        in 9..10 -> "A"
        8 -> "B"
        7 -> "C"
        6 -> "D"
        else -> "F"
    }

    fun average() : Int {
        //TODO: 小數點一位數，沒小數補 0, for example 92.0
        return (math+english)/2
    }
    //TDD
}