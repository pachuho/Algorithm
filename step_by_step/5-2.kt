package step_by_step

import java.util.*
import kotlin.collections.ArrayList

fun main(){
    var num = 1
    var selfNumber: Int
    val list = ArrayList<Int>()

    repeat(10000){
        list.add(it + 1)
    }

    while (num <= 10000){
        selfNumber = createProgression(num)
        list.remove(selfNumber)
        num++
    }

    list.map { println(it) }
}

/**
 * 수열 만들기
 * == 생성자가 있는 숫자
 * n -> d(n)
 */
private fun createProgression(n: Int): Int{
    var input = n
    var result = 0

    while(input != 0){
        result += input % 10
        input /= 10
    }
    return n + result
}

// https://www.acmicpc.net/problem/4673