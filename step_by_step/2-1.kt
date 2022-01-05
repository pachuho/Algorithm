package step_by_step

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val token = StringTokenizer(br.readLine())

    val num1 = token.nextToken().toInt()
    val num2 = token.nextToken().toInt()
    if(num1 > num2){
        println(">")
    } else if(num1 < num2){
        println("<")
    } else {
        println("==")
    }
}

// https://www.acmicpc.net/problem/1330