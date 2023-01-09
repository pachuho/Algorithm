package silver

import java.io.BufferedReader
import java.io.InputStreamReader

//1475
fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().map { it.digitToInt() }

    val freqMap = n
        .groupingBy { it }
        .eachCount().toMutableMap()

    // 6, 9 호환
    val valueSix = freqMap[6] ?: 0
    val valueNine = freqMap[9] ?: 0

    if(valueSix + valueNine > 1){
        val sum = valueSix + valueNine
        if(sum % 2 == 0){
            freqMap[6] = sum / 2
            freqMap[9] = sum / 2
        } else{
            freqMap[6] = ((sum / 2) + 1)
            freqMap[9] = sum / 2
        }
    }

    val maxValue = freqMap.maxOf { it.value }
    println(maxValue)
}