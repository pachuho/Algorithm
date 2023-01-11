package silver

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

// 2504
val stack = Stack<Any>()
fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))

    var sum = 0
    val str = br.readLine()

    str.forEach { char ->
        if(stack.isEmpty()){ // 스택이 빈 경우
            stack.add(char)
        } else {
            calculate(char)
        }

        if(stack.size == 1 && stack.peek() is Int){
            sum += stack.pop() as Int
        }
    }
    if(stack.isNotEmpty()) sum = 0
    println(sum)
}

fun calculate(char: Any){
    var tempInteger = if(stack.peek() is Int){ // 이전 값이 정수인 경우
        stack.pop() as Int
    } else 1

    if(stack.peek() is Int){ // 연속으로 정수인 경우
        tempInteger += stack.pop() as Int
    }

    if(stack.peek() == '(' && char == ')'){ // 괄호가 닫히는 경우
        val addInteger = if(stack.peek() is Int){ // 이전 값이 정수인 경우
            stack.pop() as Int
        } else 0
        stack.pop()
        stack.add(2 * tempInteger + addInteger)

    } else if(stack.peek() == '[' && char == ']'){ // 괄호가 닫히는 경우
        val addInteger = if(stack.peek() is Int){ // 이전 값이 정수인 경우
            stack.pop() as Int
        } else 0
        stack.pop()
        stack.add(3 * tempInteger + addInteger)
    } else {
        if(tempInteger > 1) { // 정수를 다시 돌려놓는다
            stack.add(tempInteger)
        }
        stack.add(char)
    }
}