package com.example.practicelabapp.kotlinPractice

data class SensorData(val name:String, val value:Double)

fun main() {
    val original = SensorData("Temperature",20.9)
    val changed = original.copy(value = 30.6)

    println("Original: $original")
    println("Changed: $changed")
}