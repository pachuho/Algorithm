package step_by_step

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()){
        StringTokenizer(br.readLine()).apply {
            bw.write((nextToken().toInt() + nextToken().toInt()).toString() + "\n")
        }
    }
    bw.flush()
    bw.close()
}
// https://www.acmicpc.net/problem/15552