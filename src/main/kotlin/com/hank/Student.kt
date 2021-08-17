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
    var name = "hanktom"

}
//Extension function
fun String.haha() {

}

fun Student.expire() {

}


class Student(val id:String,
              val name:String,
              var english:Int, var math:Int) {
    constructor(id:String, name:String) : this(id, name, 0, 0)
    fun print() {
        println("$id\t$name\t$english\t$math")
    }
}