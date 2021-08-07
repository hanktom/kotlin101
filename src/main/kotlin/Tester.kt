
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
    //物件導向程式設計 all about object
    //腳本式程式設計
    //React
    val person = Person()
    val p2 = Person()
    person.hello()
    //Property
    person.name = "Hank"
    person.hello()
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