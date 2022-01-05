package step_by_step

import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)

    val num1 = scanner.nextInt()
    val num2 = scanner.nextInt()

    if(num1 > 0 && num2 > 0){
        println("1")
    } else if(num1 < 0 && num2 > 0){
        println("2")
    } else if(num1 < 0 && num2 < 0){
        println("3")
    } else {
        println("4")
    }
}

//https://www.acmicpc.net/problem/14681