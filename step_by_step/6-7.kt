package step_by_step

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.math.max

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val token = StringTokenizer(br.readLine())
    val num1 = token.nextToken().reversed().toInt() // 2개의 수가 주어지므로 그냥 처리했지만 많은 수라면 토큰 개수를 통해 for문 처리
    val num2 = token.nextToken().reversed().toInt()
    println(max(num1, num2))
}
//https://www.acmicpc.net/problem/2908