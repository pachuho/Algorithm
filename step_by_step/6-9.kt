package step_by_step

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var str = br.readLine()
    val croatia = listOf("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")

    for(i in croatia.indices){
        while (str.contains(croatia[i])){
            str= str.replaceFirst(croatia[i], "_")
        }
    }
    println(str.length)
}
//https://www.acmicpc.net/problem/2941