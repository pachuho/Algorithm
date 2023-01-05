package step_by_step

fun main() = with(System.`in`.bufferedReader()){
    val count = readLine().toInt()
    val numbers = readLine()
    var sum = 0
    repeat(count){
        sum += numbers[it].toString().toInt()
    }
    println(sum)
}

// https://www.acmicpc.net/problem/11720