package silver

import java.math.BigInteger
import java.util.*

// 18111
fun main()= with(System.`in`.bufferedReader()){

    val (n, m ,b) = readLine().split(" ").map { it.toInt() }
    val ground = arrayListOf<Int>()
    var sum = BigInteger("0")

    repeat(n){
        val tokenizer = StringTokenizer(readLine())
        repeat(m){
            ground.add(tokenizer.nextToken().toInt())
        }
    }

    ground.forEach { sum += it.toBigInteger() }

    val result = levelingTheGround(ground, n, m, b, sum)
    println(result.toList().joinToString(" "))
}

fun levelingTheGround(arr: ArrayList<Int>, n: Int, m: Int, b: Int,sum: BigInteger): Pair<Int, Int> {
    val indexSize = n * m
    var minTime = Int.MAX_VALUE //시간비교를 위해 정수 최대값으로 선언
    var mHeight = 0 //최종 높이
    var maxHeight = (sum.plus(b.toBigInteger())).divide((n*m).toBigInteger())
    //maxHeight = 가지고있는 블럭과 입력받은 집터의 높이의 합과 나누기 집터의 크기를 통해
    //땅의 높이가 같으면서 최대로 만들 수 있는 높이를 계산할 수 있다.
    val max = 256 //문제에서 주어진 땅의 최대 높이

    if (maxHeight.compareTo(max.toBigInteger()) == 1) {//maxHeight가 max보다 크다면
        max.also { maxHeight = it.toBigInteger() }
    } else {
        maxHeight.toInt()
    }
    for (height in 0..maxHeight.toInt()) {
        var time = 0
        for (i in 0 until indexSize) {
            //전부 돌면서 체크할거라 횟수 의미 x
            if (arr[i] < height) {
                val gap = height - arr[i]
                time += gap
            } else if (arr[i] > height) {
                val gap = arr[i] - height
                time += gap * 2
            }
        }
        if (minTime >= time) {
            minTime = time
            mHeight = height
        }
    }
    return Pair(minTime, mHeight)
}
/*
3 4 1
64 64 64 64
64 64 64 64
64 64 64 63
 */