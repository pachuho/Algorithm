package silver

import java.io.BufferedReader
import java.io.InputStreamReader

// 1748
fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    var length = 0

    for(i in 1 .. n){
        when(i){
            in 1..9 -> length++
            in 10..99 -> length += 2
            in 100..999 -> length += 3
            in 1000..9999 -> length += 4
            in 10000..99999 -> length += 5
            in 100000..999999 -> length += 6
            in 1000000..9999999 -> length += 7
            in 10000000..99999999 -> length += 8
            else -> length += 9
        }
    }
    println(length)
}