package silver

import java.io.BufferedReader
import java.io.InputStreamReader

// 2563
fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val field = Array(100){ BooleanArray(100) }

    repeat(br.readLine().toInt()){
        val (p1, p2) = br.readLine().split(" ").map { it.toInt() }

        repeat(10){ dx ->
            repeat(10){ dy ->
                field[p1 + dx][p2 + dy] = true
            }
        }
    }

    println(field.sumOf { it.count { it } })
}