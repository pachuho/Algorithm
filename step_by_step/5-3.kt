package step_by_step

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.sign

fun main() = with(System.`in`.bufferedReader()) {
    val number = readLine().toInt()
    println(checkNum(number))
}

/**
 * 입력된 숫자동안 숫자를 확인한다.
 */
private fun checkNum(max: Int): Int{
    var amount = 0

    for(i in 1..max){
        if(checkLevel(i)){
            amount += 1
        }
        if((i) >= max) break

    }
    return amount
}

/**
 * 등차수열인지 확인한다.
 * 1, 2, 3
 */
private fun checkLevel(input: Int): Boolean{
    var number = input
    val list = ArrayList<Int>()
    var check = true

    while (number != 0){
        list.add(0, number % 10)
        number /= 10
    }

    return if(list.size == 1){
        check
    } else {
        repeat(list.size){
            if(it + 1 == list.size || it + 2 == list.size) {
                return@repeat
            }

            val pre = list[it + 1] - list[it]
            val post = list[it + 2] - list[it + 1]
            if(pre != post) {
                check = false
            }
        }
        check
    }
}


// https://www.acmicpc.net/problem/1065