package silver

import java.util.*

// 18111
fun main()= with(System.`in`.bufferedReader()){
    /*
    n = 세로
    m = 가로
    b = 인벤토리 블록 개수
     */
    val (n, m ,b) = readLine().split(" ").map { it.toInt() }
    val ground = Array(n){IntArray(m)}

    for (y in 0 until n){
        val tokenizer = StringTokenizer(readLine())
        for(x in 0 until m){
            ground[y][x] = tokenizer.nextToken().toInt()
        }
    }

    val sortedGround = getSortedHeight(n, m, ground)
    val mappingGround = countHeight(sortedGround)
    println(checkTime(b, mappingGround))
}

// 1. 땅 높이 정렬
fun getSortedHeight(n: Int, m:Int, array: Array<IntArray>): List<Int> {
    val sortedArray = arrayListOf<Int>()
    for (i in 0 until n) {
        for (j in 0 until m) {
            sortedArray.add(array[i][j])
        }
    }

    return sortedArray.sortedDescending()
}

fun countHeight(array: List<Int>): Map<Int, Int> {
    return array.groupingBy { it }.eachCount()
}

// 3. 가진 블록 개수로 처리 가능한지 체크하며 시간초 계산
fun checkTime(blocks: Int, ground: Map<Int, Int>): Int{
}
/*
3 4 99
0 0 0 0
0 2 2 2
0 0 0 1
 */