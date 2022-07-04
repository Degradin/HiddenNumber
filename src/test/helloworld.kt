package test

import java.lang.Error

fun main() {
    val hiddenNumber: Int = (0..100).random()
    println("Я загадал число $hiddenNumber")

    for (i in 1..7){
        try {
            val enteredData = readLine()!!
            val enteredNumber = enteredData.toInt()
            if (enteredNumber == hiddenNumber) {
                println("You find correct number")
            }else if (enteredNumber > hiddenNumber && i != 7){
                println("Less")
            }else if (enteredNumber < hiddenNumber && i != 7){
                println("More")
            }else{
                println("You died, the number was $hiddenNumber")
            }
        } catch (e: NumberFormatException) {
            println(e)
        }
    }
}


