package step_by_step

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val str = br.readLine()
    val result = IntArray(26){-1}
    var idx: Int

    for(i in str.indices){
        idx = str[i].code - 97
        if(result[idx] == -1) result[idx] = i

    }

    for (i in result){
        bw.write("$i ")
    }
    bw.flush()
    bw.close()
}
// 초기 코드
//fun main() = with(System.`in`.bufferedReader()){
//    val word = readLine()
//
//    val charArray = ArrayList<Int>()
//    var result = ""
//
//    repeat(word.length){
//        charArray.add(word[it].code)
//    }
//
//    for (ascii in 97..122){
//        var complete = false
//        for(char in 0 until charArray.size){
//            if(ascii == charArray[char]){
//                result += "$char "
//                complete = true
//                break
//            }
//        }
//        if(!complete){
//            result += "-1 "
//        }
//    }
//    println(result.trim())
//}

// https://www.acmicpc.net/problem/10809