package com.example.practicelabapp.kotlinPractice

class Sensor(val name: String, val value: Double) {

    fun describe() {
        println("$name: $value")
    }

    fun isAbove(threshold: Double): Boolean {
        return if (value > threshold) {
            true
        } else if (value < threshold) {
            false
        }else {
            false
        }
    }
}


fun main() {
    val temperature = Sensor("Temperature", 25.0)
    val humidity = Sensor("Humidity", 50.0)

    temperature.describe()
    println("Temperature Above 30: ${temperature.isAbove(30.0)}")

    humidity.describe()
    println("Humidity Above 12.5: ${humidity.isAbove(12.5)}")

}