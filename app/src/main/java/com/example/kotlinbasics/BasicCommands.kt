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

    println("First character" + firstCharInString)
    println("Last character " + lastCharInString)

    //endregion

    //region Template
        println("The length of myString is ${myString.length} letters")
    //endregion
}