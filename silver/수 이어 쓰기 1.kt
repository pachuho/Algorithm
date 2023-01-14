package silver

import java.io.BufferedReader
import java.io.InputStreamReader

// 1748
fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    var sum = 0

    for(i in 1..n){
        sum += i.getDigit()
    }

    println(sum)
}

fun Int.getDigit(): Int{
    var temp = this
    var digit = 0

    while (temp != 0){
        temp /= 10
        digit++
    }
    return digit
}

// when문을 통한 하드코딩의 경우 코드가 한정적이라는 단점이 있지만 시간이 약 3배 줄어들었다. 계산하는 것 보단 숫자를 대응시키는게 훨씬 바르다는걸 알게 되었다.