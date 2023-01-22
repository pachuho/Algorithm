package silver

// 3085
fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    val candies = Array(n){ charArrayOf()}

    repeat(n){
        candies[it] = readLine().toCharArray()
    }

    val dx = intArrayOf(0, -1, 0, 1)
    val dy = intArrayOf(-1, 0, 1, 0)

    var result = 0

    for(i in candies.indices){
        for(j in candies.indices){
            for (d in 0 until 4){
                val changeY = i + dy[d]
                val changeX = j + dx[d]

                if(changeX in candies.indices && changeY in candies.indices){
                    swapCandies(candies, i, j, changeY, changeX)
                    result = maxOf(result, checkMaxCandies(candies, i, j))
                    swapCandies(candies, changeY, changeX, i, j)
                }
            }
        }
    }

    println(result)
}

fun swapCandies(candies: Array<CharArray>, i: Int, j: Int, k: Int, l: Int){
    val temp = candies[i][j]
    candies[i][j] = candies[k][l]
    candies[k][l] = temp
}

// 2. 행열 캔디 개수 체크
fun checkMaxCandies(candies: Array<CharArray>, i: Int, j: Int): Int{
    var iMax = 0
    var jMax = 0

    var count = 1
    for(k in 1 until candies.size){
        if(candies[i][k - 1] == candies[i][k]){
            count++
            iMax = maxOf(iMax, count)
        } else{
            count = 1
        }
    }

    count = 1
    for(l in 1 until candies.size){
        if(candies[l - 1][j] == candies[l][j]){
            count++
            jMax = maxOf(jMax, count)
        } else{
            count = 1
        }
    }

    return maxOf(iMax, jMax)
}
/*
P P P P
C Y Z Y
C C P Y
P P C C
 */