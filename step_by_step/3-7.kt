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
            bw.write("Case #$i: " + (nextToken().toInt() + nextToken().toInt()) + "\n")
        }
    }
    bw.flush()
    bw.close()
}

// https://www.acmicpc.net/problem/11021