package step_by_step

import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(Scanner(System.`in`)){
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))

    for(i in 1..nextInt()){
        repeat(i){
            bw.write("*")
        }
        bw.write("\n")
    }
    bw.flush()
    bw.close()
}
// https://www.acmicpc.net/problem/2438