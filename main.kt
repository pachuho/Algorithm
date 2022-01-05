import java.util.*

fun main(){
  val scanner = Scanner(System.`in`)
  val num1 = scanner.nextInt()
  val num2 = scanner.nextInt()

  // 나누기와 나머지를 통해 자리수 계산
  println(num1 * (num2 % 10))
  println(num1 * ((num2 % 100) / 10))
  println(num1 * (num2 / 100))

  println(num1 * num2)
}