package silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.roundToInt

// 2108
fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val length = br.readLine().toInt()
    val numbers = ArrayList<Int>()

    repeat(length){
        numbers.add(br.readLine().toInt())
    }
    bw.apply {
        write("${getAverage(numbers)}\n")
        write("${getMidValue(numbers)}\n")
        write("${getModeValue(numbers)}\n")
        write("${getRange(numbers)}")

        flush()
        close()
    }
}
// 산술평균
fun getAverage(numbers: ArrayList<Int>): Int{
    return numbers.average().roundToInt()
}

// 중앙값
fun getMidValue(numbers: ArrayList<Int>): Int{
    val sortedList = numbers.sorted()
    val mid = sortedList.size / 2
    return sortedList[mid]
}

// 최빈값
fun getModeValue(numbers: ArrayList<Int>): Int{
    val freqMap = numbers.groupingBy { it }.eachCount()
    val maxValue = freqMap.maxOf { it.value }
    val maxKeys = freqMap.filter { it.value == maxValue }.keys.sorted()

    return if(maxKeys.size == 1){
        maxKeys.first()
    } else{
        maxKeys[1]
    }
}

// 범위
fun getRange(numbers: ArrayList<Int>): Int {
    val max = numbers.maxOf { it }
    val min = numbers.minOf { it }
    return max - min
}