package silver

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

// 제로
fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val k = br.readLine().toInt()
    val stack = Stack<Int>()

    stack.apply {
        repeat(k){
            val num = br.readLine().toInt()
            if(num == 0){
                pop()
            } else{
                stack.push(num)
            }
        }
    }
    println(stack.sum())
}