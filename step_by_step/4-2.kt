package step_by_step

import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true){
        val line = readLine()
        if(line == null || line == "") break
        val tokenizer = StringTokenizer(line)
        bw.write("${tokenizer.nextToken().toInt() + tokenizer.nextToken().toInt()}\n")
    }
    bw.flush()
    bw.close()
    close()
}

//https://www.acmicpc.net/problem/10951