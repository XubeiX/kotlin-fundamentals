fun main() {
    println("Execute variables")
    variables()
    println("Execute datatype")
    datatype()
    println("Execute operators")
    operators()
    println("Execute statements")
    statements()
    println("Execute loops")
    loops()
}

fun variables() {
    var simpleVariable = "Some text can be store here"
    println(simpleVariable)
    simpleVariable = "New value"
    println(simpleVariable)

    val simpleValue = "Value can't be reassigned"
    //simpleValue = "test" throws error
}

fun datatype() {
    val stringType = "text"
    val intType = 21 //default int

    val myByte: Byte = 13 //8bit
    val myShort: Short = 125 //16bit
    val myInt: Int = 123123123 //32bit
    val myLong: Long = 12_123_123_123_123_123L //64bit

    val doubleType = 3.14 //default double (without F)
    val myFloat: Float = 12.3F //32bit
    val myDouble: Double = 3.14159 //64bit

    val isTrue: Boolean = false
    val shortBoolean = true

    //Characters
    val letterChar = 'A'
    val digitChar: Char = '1'

    //String
    val myStr = "Hello world"
    val firstCharacter = myStr[0]
    val firstCharacter2 =  myStr.first()
    println("$firstCharacter and $firstCharacter2") //string template example
    println("Last character: ${myStr.last()} and string length ${myStr.length}")

}

fun operators() {
    //Arithmetic operators + - * / %
    var test = 4 + 2
    println(test)
    test /= 2
    println(test)
    test *= 3
    println(test)

    println("Int divide 5/3 = ${5/3} - int result")
    println("Other type = 5.0/3 = ${5.0/3}")
    println("Convert 5/3 = ${(5/3).toDouble()} - double result")

    //Comparison operators == != < > <= >=
    println("Is Equals ${ 5 == 5}")

    //Assignment operators += -= *= /= %=  //standard
    //Increment & Decrement operators -- ++ //standard
    var num = 1
    println("Inc test ${++num}")
}

fun statements() {
    var age = 21
    if (age >= 21) {
        println("Drink")
    } else if(age >= 18) {
        println("vote")
    } else if(age >= 16){
        println("drive")
    } else {
        println("too young")
    }

    val result = when (age){
        in 21..100 -> "Drink"
        in 18 .. 21 -> "vote"
        else -> "too young"
    }

    println("When result $result")

}

fun loops(){
    var x = 1

    while (x <= 10){ //standard while loop
        println("Loops i=$x")
        x++
    }

    do {
        println("2nd loop i=$x")
        x++
    } while (x <= 20) //standard do-while loop

    for(num in 1..10000) { // <1,10000>
        if(num == 9001)
            println("IT'S OVER 9000!!!")
    }
    for(num2 in 1 until 5) // <1,5)
        println("For2 $num2")
    for (num3 in 10 downTo 1 step 2) //<10,1>
        println("For3 $num3")
}