package step_by_step

import java.util.*

fun main(){
    val year = Scanner(System.`in`).nextInt()
    val result = if(checkLeapYear(year)) 1 else 0
    print(result)
}

fun checkLeapYear(year: Int): Boolean{
    year.apply {
        return (this % 4 == 0) && (this % 100 != 0) || this % 400 == 0
    }
}

//https://www.acmicpc.net/problem/2753