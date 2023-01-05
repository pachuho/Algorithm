package step_by_step

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val loop = br.readLine().toInt()

    repeat(loop){
        val tokens = StringTokenizer(br.readLine())
        val subloop = tokens.nextToken().toInt()
        val str = tokens.nextToken().toString()

        str.forEach { char ->
            repeat(subloop){
                bw.write(char.toString())
            }
        }
        bw.write("\n")
    }
    bw.flush()
    bw.close()
}
//https://www.acmicpc.net/problem/2675