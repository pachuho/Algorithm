package silver

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

// 2740
fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))

    val (m1, k1) = br.readLine().split(" ").map { it.toInt() } // 3 2
    val arrayA: Array<IntArray> = Array(m1) {IntArray(k1)}

    repeat(m1){ y ->
        val token = StringTokenizer(br.readLine())
        repeat(k1){ x ->
            arrayA[y][x] = token.nextToken().toInt()
        }
    }

    val (m2, k2) = br.readLine().split(" ").map { it.toInt() } // 2 3
    val arrayB: Array<IntArray> = Array(m2) {IntArray(k2)}

    repeat(m2){ y ->
        val token = StringTokenizer(br.readLine())
        repeat(k2){ x ->
            arrayB[y][x] = token.nextToken().toInt()
        }
    }

    val arrayResult = Array(m1) {IntArray(k2)}
}