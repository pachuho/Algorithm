package step_by_step

import java.io.BufferedReader
import java.io.InputStreamReader

// 1316 그룹 단어 체커
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    var cnt = n

    repeat(n){
        val alphabets = IntArray(26){0}
        val str = br.readLine()
        var loop = 0
        while (loop < str.length){
            for(j in alphabets.indices){
                if((str[loop].code - 'a'.code) == j){ // 일치하는 경우
                    if(alphabets[j] > 0 && (str[loop] != str[loop - 1])){ // 1회 이상 일치했는데 이전 문자가 아닌 경우
                        cnt --
                        loop = str.length
                        break
                    }
                    alphabets[j] += 1
                }
            }
            loop ++
        }

    }
    println(cnt)
}