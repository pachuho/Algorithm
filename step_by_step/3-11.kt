package step_by_step

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val firstLine = StringTokenizer(br.readLine())

    val case = firstLine.nextToken().toInt()
    val standard = firstLine.nextToken().toInt()

    val numbers = StringTokenizer(br.readLine())
    repeat(case){
        val number = numbers.nextToken().toInt()
        if(standard > number){
            bw.write("$number ")
        }
    }
    bw.flush()
    bw.close()
}

// https://www.acmicpc.net/problem/10871