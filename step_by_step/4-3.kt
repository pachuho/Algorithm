package step_by_step

import java.util.*

fun main() = with(Scanner(System.`in`)){
    val num = readLine()!!
    val existingNumber = num.toInt()
    var newNumber = existingNumber
    var cycle = 0
    var fir = 0
    var sec = 0

    while(true){

        if (newNumber < 10){
            fir = 0
            sec = newNumber
        } else {
            fir = newNumber.toString()[0].digitToInt()
            sec = newNumber.toString()[1].digitToInt()
        }

        var sum = fir + sec

        newNumber = (sec.toString() + sum.toString().last().toString()).toInt()

        cycle += 1

        if(existingNumber == newNumber){
            break
        }
    }
    println(cycle)
}

//https://www.acmicpc.net/problem/1110