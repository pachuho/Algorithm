package step_by_step

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val token = StringTokenizer(br.readLine())
    println(token.countTokens())
}
//https://www.acmicpc.net/problem/1152