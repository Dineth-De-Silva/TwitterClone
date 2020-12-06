package com.kalan.android.twitterclone

fun main() {

    val myInt : Int = 5
    //Int, String, Double, Float
    println(myInt)

    val circle3Feet : Circle = Circle(3.0) //circle3Feet is an instance of Circle class -> Object
    val circle3FeetArea = circle3Feet.area()
    val circle4 = Circle(4.0)

    println("Area 3feet $circle3FeetArea")
    println("Radius 3feet ${circle3Feet.radius}")

    val circle2Feet : Circle = Circle(2.0)
}

class Circle(val radius : Double) {
    private val pi : Double = 3.14

    fun area() = 2 * pi * radius
}