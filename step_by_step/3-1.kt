package step_by_step

import java.util.*

fun main(){
    val n = Scanner(System.`in`).nextInt()

    for (i in 1..9){
        println("$n * $i = ${n*i}")
    }
}

//https://www.acmicpc.net/problem/2739