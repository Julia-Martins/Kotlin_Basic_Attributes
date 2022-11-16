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
    //println("$myNum")

        //region Increments & Decrements    (++,    --)

        // ++
        myNum++
//        println("Printing with ++ $myNum")

        ++myNum
//        println("Printing with ++ in other side $myNum")

        // --
        myNum--
//        println("Printing with -- $myNum")

        --myNum
//        println("Printing with -- in other side $myNum")
        // endregion

    // -=
    myNum -= 7
//    println("$myNum")

    // *=
    myNum *= 7
//    println("$myNum")

    // /=
    myNum /= 7
//    println("$myNum")

    // %=
    myNum %= 7
//    println("$myNum")

    //endregion

    //region If Statements (If/  Else If/  Else)
    val heightPerson10 = 170
    val heightPerson20 = 189

    if(heightPerson10  > heightPerson20){
//        println("Person 10 is taller than Person 20")
    }else if(heightPerson10 == heightPerson20){
//        println("Person 10 is equal than Person 20")
    }else{
//        println("Person 20 is taller than Person 10")
    }

    // Exercise

    val age = 13
    val drinkAge = 21
    val voteAge = 18
    val driveAge = 16

    if(age >= drinkAge){
//        println("You have $age")
//        println("Now you can do whatever you want, but you wil pay the consequences")
    }else if(age >= voteAge){
//        println("You have $age")
//        println("Now you can vote in a candidate")
    }else if(age >= driveAge){
//        println("You have $age")
//        println("Now you can drive, but be careful to crash the vehicular")
    }else{
//        println("You can't do anything yet, just wait some time for you grow up")
    }

    //endregion

    // region When Expressions (When)
//    var season = 3

//    when(season){
//        1 -> println("Spring")
//        2 -> println("Summer")
//        3 ->{
//            println("Fall")
//            println("Autumn")
//        }
//        4 -> println("Winter")
//        else -> println("Invalid Season")
//    }

//    var month = 3
//    when(month){
//        in 3..5 -> println("Spring")
//        in 6..8 -> println("Summer")
//        in 9..11 -> {
//            println("Fall")
//            println("Autumn")
//        }
//        in 12 downTo 2 -> println("Winter")
//        else -> println("Invalid Month")
//    }

//    when(age){
//        !in 0..20 -> println("Now you may drink in US")
//        in 18..20 -> println("Now you may vote in so many countries")
//        in 16..17 -> println("Now you may drive in US")
//        else -> println("You're too young")
//    }

//    var x : Any = 21.7f

//    when(x){
//        is Int -> println("$x is an Int")
//        is Double -> println("$x is a Double")
//        is String -> println("$x is a String")
//        else -> println("$x is none of the above")
//    }

    // endregion

    //region Loop(While/ Do While)

    var x = 21
    while(x >= 0){
        //println("$x")
        x -= 2
    }

    x = 100
    do{
//        println("$x")
        x--
    }while (x >= 90)

    var feltTemp = "cold"
    var roomTemp = -10

    while(feltTemp == "cold"){
        roomTemp++
        if(roomTemp >= 20){
            feltTemp = "Comfy"
            println("It's comfy now")
        }
    }

    //endregion
}