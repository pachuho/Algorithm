package silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

// 17413
fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val stack = Stack<Char>()
    val str = br.readLine()
    var isBracket = false

    for(i in str.indices) {
        if(str[i] == '<'){
            if(stack.isNotEmpty()){
                repeat(stack.size){
                    bw.write(stack.pop().toString())
                }
            }
            isBracket = true
            bw.write(str[i].toString())
            continue
        }

        if(str[i] == '>'){
            isBracket = false
            bw.write(str[i].toString())
            continue
        }

        if(isBracket && str[i] != '>'){
            bw.write(str[i].toString())
        } else if(str[i] == ' '){
            repeat(stack.size){
                bw.write(stack.pop().toString())
            }
            bw.write(str[i].toString())
         } else if(i == str.length - 1){
             stack.add(str[i])
             repeat(stack.size){
                 bw.write(stack.pop().toString())
             }
        } else if((str[i].code >= 'a'.code && str[i].code <= 'z'.code)
            || (str[i].code >= '0'.code && str[i].code <= '9'.code)){
            stack.add(str[i])
        }
    }

    bw.flush()
    bw.close()

}