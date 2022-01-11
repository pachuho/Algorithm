package step_by_step

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val n = BufferedReader(InputStreamReader(System.`in`)).readLine().toInt()
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    for(i in n downTo 1){
        bw.write("$i\n")
    }
    bw.flush()
    bw.close()
}

// https://www.acmicpc.net/problem/2742