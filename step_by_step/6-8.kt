package step_by_step

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val str = br.readLine()
    val dial = listOf("ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ")
    var time = 0

    str.forEach { char ->
        for(i in dial.indices){
            if(dial[i].contains(char)){
                time += (i + 2)
            }
        }
        time ++
    }

    println(time)

}
//https://www.acmicpc.net/problem/5622