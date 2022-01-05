 package step_by_step

import java.util.*

fun main(){
    val sc = Scanner(System.`in`)

    var hour = sc.nextInt()
    var minute = sc.nextInt()

    minute -= 45
    if(minute < 0){
        minute += 60
        hour -= 1
        if(hour < 0){
            hour += 24
        }
    }
    println("$hour $minute")
}

// https://www.acmicpc.net/problem/2884