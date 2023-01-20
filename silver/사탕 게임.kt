package silver

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

// 3085
fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    val candies = Array(n){ charArrayOf()}

    repeat(n){
        candies[it] = readLine().toCharArray()
    }

    println(candies)


}
/*
P P P P
C Y Z Y
C C P Y
P P C C
 */