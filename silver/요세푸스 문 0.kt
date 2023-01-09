package silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

// 11866
fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val token = StringTokenizer(br.readLine())
    val n = token.nextToken().toInt() // Total
    val k = token.nextToken().toInt() // Index

    val queue = LinkedList<Int>()
    repeat(n){
        queue.add(it + 1)
    }

    var cnt = 0
    bw.write("<")
    while (queue.size > 0){
        if(cnt == k - 1){
            val add = if(queue.size == 1) "" else ", "
            bw.write("${queue.remove()}$add")
            cnt = 0
        } else {
            queue.add(queue.remove())
            cnt++
        }
    }
    bw.write(">")

    bw.flush()
    bw.close()
}
// 1 2 3 4 5 6 7