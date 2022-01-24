package step_by_step

import java.util.*

fun main() = with(Scanner(System.`in`)){
    val n = nextLine().toInt()
    var array = mutableListOf<Int>()
    val st = StringTokenizer(nextLine())

    repeat(n){
        array.add(st.nextToken().toInt())
    }
    println("${array.minOrNull()} ${array.maxOrNull()}")

}

// https://www.acmicpc.net/problem/10818