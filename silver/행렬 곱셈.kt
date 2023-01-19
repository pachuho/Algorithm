package silver

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

// 2740
fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val stringBuilder = StringBuilder()

    val (m1, k1) = br.readLine().split(" ").map { it.toInt() } // 3 2
    val arrayA: Array<IntArray> = Array(m1) {IntArray(k1)}

    repeat(m1){ x ->
        val token = StringTokenizer(br.readLine())
        repeat(k1){ y ->
            arrayA[x][y] = token.nextToken().toInt()
        }
    }

    val (m2, k2) = br.readLine().split(" ").map { it.toInt() } // 2 3
    val arrayB: Array<IntArray> = Array(m2) {IntArray(k2)}

    repeat(m2){ x ->
        val token = StringTokenizer(br.readLine())
        repeat(k2){ y ->
            arrayB[x][y] = token.nextToken().toInt()
        }
    }

    repeat(m1){ x -> // 3
        repeat(k2){ y -> // 3
            var sum = 0

            repeat(m2){ i -> // 2
                sum += arrayA[x][i] * arrayB[i][y]
            }
            stringBuilder.append("$sum")
            if(y != k2-1) stringBuilder.append(" ")
        }
        stringBuilder.append("\n")
    }

    println(stringBuilder)
}

// result[0][0] = a[0][0] * b[0][0] + a[0][1] * b[1][0]
// result[0][1] = a[0][0] * b[0][1] + a[0][1] * b[1][1]
// result[0][2] = a[0][0] * b[0][2] + a[0][1] * b[1][2]

// result[1][0] = a[1][0] * b[0][0] + a[1][1] * b[1][0]
// result[1][1] = a[1][0] * b[0][1] + a[1][1] * b[1][1]
// result[1][2] = a[1][0] * b[0][2] + a[1][1] * b[1][2]

// result[2][0] = a[2][0] * b[0][0] + a[2][1] * b[1][0]
// result[2][1] = a[2][0] * b[0][1] + a[2][1] * b[1][1]
// result[2][2] = a[2][0] * b[0][2] + a[2][1] * b[1][2]