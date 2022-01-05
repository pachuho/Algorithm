package step_by_step

import java.util.*

fun main(){
    val num = Scanner(System.`in`).nextInt()

        num.apply {
            if(this >= 90){
                println("A")
            } else if(this >= 80){
                println("B")
            } else if(this >= 70){
                println("C")
            } else if(this >= 60){
                println("D")
            } else{
                println("F")
            }
        }
}

// https://www.acmicpc.net/problem/9498