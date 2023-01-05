package step_by_step

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val alphabet = IntArray(26){0} // 알파벳 배열 생성

    val str = br.readLine().uppercase() // 대문자 변환

    // 문자열을 돌며 알파벳 횟수 확인
    str.forEach {
        alphabet[it.code - 'A'.code] ++
    }

//    alphabet.forEach {
//        bw.write("$it ")
//    }
//    bw.write("\n")

    var index = 0
    var max = 0
    var cnt = 0

    // 최댓값 위치 확인
    for(i in alphabet.indices){
        if(max <= alphabet[i]){ // 이상
            if(max == alphabet[i]){ // 같은 경우
                cnt ++
            } else{ // 큰 경우
                max = alphabet[i]
                index = i
                cnt = 0
            }
        }
    }

    if(cnt > 0){
        bw.write("?")
    } else{
        bw.write("${('A'.code + index).toChar()}")
    }

//    println("max is $max, index is ${('A'.code + index).toChar()}")
    bw.flush()
    bw.close()
}
//https://www.acmicpc.net/problem/1157