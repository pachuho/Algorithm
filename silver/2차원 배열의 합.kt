package silver

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

// 2167
fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (s1, s2) = br.readLine().split(" ").map { it.toInt() }
    val array = Array(s1) {IntArray(s2)}

    repeat(s1){ x ->
        val token = StringTokenizer(br.readLine())
        repeat(s2){ y ->
            array[x][y] = token.nextToken().toInt()
        }
    }

    repeat(br.readLine().toInt()){
        val(i, j, x, y) = br.readLine().split(" ").map { it.toInt() - 1 }
        var sum = 0

        for(dx in 0 until s1){
            if(dx < i) continue
            if(dx > x) break
            for(dy in 0 until s2){
                if(dy < j) continue
                if(dy > y) break
                sum += array[dx][dy]
            }
        }

        println(sum)
    }
}