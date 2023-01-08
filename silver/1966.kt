package silver

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.contracts.contract

// 프린터 큐
fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val loop = br.readLine().toInt()
    val queue = ArrayDeque<Pair<Int, Int>>() // 순서, 중요도
    var token: StringTokenizer
    var n: Int // 문서 개수
    var m: Int // 몇 번째로 출력되는지 궁금한 문서 위치

    repeat(loop){
        token = StringTokenizer(br.readLine())
        n = token.nextToken().toInt()
        m = token.nextToken().toInt()

        token = StringTokenizer(br.readLine())
        repeat(n){
            queue.offer(Pair(it, token.nextToken().toInt())) // 큐에 대기열 추가
        }

//        println(queue.toString())
        // 1 2 3 4
        // 우선순위 비교
        var condition = queue.size
        while (queue.size > 1 && condition > 0){
            var pass = false
            for (i in queue.indices){
                if(i == queue.size - 1) break
                if(queue.elementAt(i).second < queue.elementAt(i + 1).second){
                    queue.offer(queue.pop())
                } else{
                    pass = true
                }
            }
            if(pass) condition --
        }
        println(queue.toString())

        queue.clear()
    }

}