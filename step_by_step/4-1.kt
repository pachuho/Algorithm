package step_by_step

import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while(true){
        val tokenizer = StringTokenizer(readLine())
        val num1 = tokenizer.nextToken().toInt()
        val num2 = tokenizer.nextToken().toInt()

        if(num1 == 0 && num2 == 0) break
        bw.write("${num1 + num2}\n")
    }
    bw.flush()
    bw.close()
    close()
}

// 처음 코드
//fun main(){
//    val br = BufferedReader(InputStreamReader(System.`in`))
//    val bw = BufferedWriter(OutputStreamWriter(System.out))
//    do {
//        val token = StringTokenizer(br.readLine())
//
//        val num1 = token.nextToken().toInt()
//        val num2 = token.nextToken().toInt()
//
//        val result = checkZero(num1, num2)
//        if(result){
//            bw.write("${num1 + num2}\n")
//        }
//    } while (result)
//    bw.flush()
//    bw.close()
//    br.close()
//}
//
//fun checkZero(token1: Int, token2: Int): Boolean{
//    if(token1 == 0 && token2 == 0){
//        return false
//    }
//    return true
//}

//https://www.acmicpc.net/problem/10952