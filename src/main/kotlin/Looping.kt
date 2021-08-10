
fun main(args: Array<String>) {
    println(args.size)
    var min = 1
    var max = 10
    if (args.size > 0 && args.size == 2) {
        min = args[0].toInt()
        max = args[1].toInt()
    }
    println("Please enter a number ($min - $max)")
//    for (int i=0; i<10; i+=2)
//    for (int i=29; i>=0 ; i--)
    //Range
    for (i in 0..29) print(i%10)
    println()
    //
    for (i in 0..29) {
        print(if (i%2==0) "*" else " ")
    }
    println()
//    012345678901234567890123456789
//    *  *  *  *  *  *  *  *  *  *
    for (i in 0..29) {
        print(if (i%3==0) "*" else " ")
    }
    println()
//    012345678901234567890123456789
//    **  **  **  **  **  **  **  **
    //作業

    for (i in 0..29) print("*")
    println()
    for (i in 0 until 30) print("*")
    println()
    for (i in 29 downTo 0) print("*")
    println()
    //*****
    // *****
    //  *****
    //   *****
    //...
    for (i in 0..25) {
        for (j in 0..29) {
            if (j in i..i+4) {
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }
    //作業，印出 X-men
}