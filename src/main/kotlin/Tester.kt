//Top level
fun main() {
    println("Hello world")
    //Int, Short, Long, Byte, Char
    //Float, Double, Boolean
    val age:Int = 18
    var ball = 3
    ball += 2
    var isOnSale = false
    println(ball)
    isOnSale = true
    var name:String? = "Jack"
    name = null
    println(age > -3 && age < 5)
//    Tester test = new Tester();
//    int n = 10;
//    Tester()
    val person = Person()
    person.hello()
    person.name = "Hank"
    person.name = null
    //Null check
    val length = person.name?.length
    println(length)
//    person = Person() go wrong!
}

class Person {
//    String name;
    var name:String? = null
    //public void hello() { .. }
    fun hello() {
        println("Hello Kotlin from Person")
    }
}