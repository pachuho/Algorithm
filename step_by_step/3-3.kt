package step_by_step

import java.util.*

fun main() = with(Scanner(System.`in`)){
    var sum = 0
    for(i in 1..nextInt()){
        sum += i
    }
    println(sum)
}

// https://www.acmicpc.net/problem/8393
