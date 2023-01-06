package silver

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.collections.ArrayList

// 덩치
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val humans = ArrayList<Human>()

        // 사람들 정보 입력
    repeat(n){
        val token = StringTokenizer(br.readLine())
        humans.add(Human(token.nextToken().toInt(), token.nextToken().toInt(), 1))
    }

    // 덩치 비교
    repeat(n){ me ->
        for(target in humans.indices){
            if(me == target) continue

            if(humans[me].kg < humans[target].kg && humans[me].height < humans[target].height){
                humans[me].rank ++
            }
        }
    }

    repeat(n){
        print("${humans[it].rank} ")
    }
}

data class Human(val height: Int, val kg: Int, var rank: Int)