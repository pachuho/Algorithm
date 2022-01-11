package step_by_step

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))

    val testCase = br.readLine().toInt()
    for(i in 1 .. testCase){
        StringTokenizer(br.readLine()).apply {
            val first = nextToken()
            val second = nextToken()
            bw.write("Case #$i: $first + $second = ${first.toInt() + second.toInt()} \n")
        }
    }
    bw.flush()
    bw.close()
}

// https://www.acmicpc.net/problem/11022