package silver

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

// 프린터 큐
fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val loop = br.readLine().toInt()
    val queue = ArrayDeque<Pair<Int, Int>>() // 순서, 중요도
    val resultQueue = ArrayDeque<Pair<Int, Int>>() // 결과
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

        // 우선순위 비교
        while (queue.size > 1){
            var pass = true
            for(i in queue.indices){
                if(i == queue.size - 1) break

                if(queue.elementAt(0).second < queue.elementAt(i + 1).second){
                    queue.add(queue.pop())
                    pass = false
                    break
                }
            }
            if(pass) resultQueue.add(queue.pop())
        }

        resultQueue.add(queue.pop())

        for(i in resultQueue.indices){
            if( resultQueue.elementAt(i).first == m) println(i+1)
        }
        resultQueue.clear()
    }
}