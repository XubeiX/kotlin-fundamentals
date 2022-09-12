fun main() {
    println("Execute variables")
    variables()
    println("Execute datatype")
    datatype()
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