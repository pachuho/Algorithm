import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main(){
  val br = BufferedReader(InputStreamReader(System.`in`))
  val token = StringTokenizer(br.readLine())
  println(token.nextToken().toInt() + token.nextToken().toInt())
}
