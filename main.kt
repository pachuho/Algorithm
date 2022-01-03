import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

var inputNumber = mutableListOf<String>()
var resultNumber = mutableListOf<Int>()
var total = 0

fun main(){
  // 숫자 두번 입력받기
  for(i in 1..2){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val token = StringTokenizer(br.readLine())
    inputNumber.add(token.nextToken())
  }

  for(number in inputNumber[1]){
    val result = inputNumber[0].toInt() * Character.getNumericValue(number)
    resultNumber.add(result)
  }

  var count = 1
  for(result in resultNumber.reversed()){
    println(result)

    total += (result * count)
    count *= 10
  }
  println(total)
}