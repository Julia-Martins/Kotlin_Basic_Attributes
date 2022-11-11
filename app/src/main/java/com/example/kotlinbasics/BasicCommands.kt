package com.example.kotlinbasics

fun main(){
    // region Immutable Variable
    // TODO: Add new functionalities
    var favoriteColor = "Blue"

    // Declare Variables
    // String
    val myString: String = "Wolf's Force"
    var firstCharInString = myString[0]
    var lastCharInString = myString[myString.length - 1]

    // Int
    val myInt: Int = 21
    // Byte
    val myByte: Byte = 21
    // Short
    val myShort: Short = 11111
    // Long
    val myLong: Long = 1111111111111111111
    // Float
    val myFloat: Float = 21.72f
    // Double
    val myDouble: Double = 21.728197
    // Boolean
    var isWinter: Boolean = false
    isWinter = true
    // Char
    val myCharLetter: Char = 'J'
    val myCharNumber: Char = '7'

    /*println("First character" + firstCharInString)
    println("Last character " + lastCharInString)*/

    //endregion

    //region Template
//        println("The length of myString is ${myString.length} letters")
    //endregion

    // region Arithmetic Operators  (+,    -,    *,   /,     %)

    // Multiplication
    var result0 = 5+2f
    result0 *= 2
//    println(result0)

    // Division
    var result1 = 5+2f
    result1 /= 2
//    println(result1)

    // Plus equal
    var result2 = 5+2f
    result2 += 2
//    println(result2)

    // Minus
    var result3 = 5+2f
    result3 -= 2
//    println(result3)

    // Modulo
    var result4 = 5+2f
    result4 = 21%2f
//    println(result4)

    //endregion

    // region Comparison Operators  (==,    !=,     <,   >,     <=,     >=)
    val a = 21
    val b = 7

    // ==
    val isEqual = a==b
//    println("The result is $isEqual")

    // !=
    val isNotEqual = a != b
//     println("The result is $isNotEqual")

    // < or <=
//    println("The result is ${7 < -21}")
//    println("The result is ${7 <= 21}")

    // > or >=
//    println("The result is ${7 > 21}")
//    println("The result is ${7 >= -21}")
    //endregion

    // region Assignment operators (+=,     -=,     *=,     /=,     %=)

    // +=
    var myNum = 7
    myNum += 7
    println("$myNum")

        //region Increments & Decrements    (++,    --)

        // ++
        myNum++
        println("Printing with ++ $myNum")

        ++myNum
        println("Printing with ++ in other side $myNum")

        // --
        myNum--
        println("Printing with -- $myNum")

        --myNum
        println("Printing with -- in other side $myNum")
        // endregion

    // -=
    myNum -= 7
    println("$myNum")

    // *=
    myNum *= 7
    println("$myNum")

    // /=
    myNum /= 7
    println("$myNum")

    // %=
    myNum %= 7
    println("$myNum")

    //endregion
}