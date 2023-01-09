package silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

// 11723
fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val m = br.readLine().toInt()
    val s = BooleanArray(20){false}

    repeat(m){
        val token = StringTokenizer(br.readLine())
        val func = token.nextToken()

        if(func == "all" || func == "empty"){
            when(func){
                "all" -> for(i in s.indices) s[i] = true
                "empty" -> for(i in s.indices) s[i] = false
            }
        } else{
            val value = token.nextToken().toInt()
            when(func){
                "add" -> s[value - 1] = true
                "remove" -> s[value - 1] = false
                "check" -> bw.write("${if(s[value - 1]) 1 else 0}\n")
                "toggle" -> s[value - 1] = !s[value - 1]
            }
        }
    }
    bw.flush()
    bw.close()
}