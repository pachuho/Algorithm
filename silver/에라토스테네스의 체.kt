package silver

import java.io.BufferedReader
import java.io.InputStreamReader

// 2960
fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val array = ArrayDeque<Int>()
    val result = ArrayDeque<Int>()

    val (n, k) = br.readLine().split(" ").map { it.toInt() }

    for(i in 2 .. n){
        array.add(i)
    }

    while (array.size > 0){
        val first = array.first()
        for(i in array.indices){
            if(i >= array.size) break
            if(array.elementAt(i) % first == 0) {
                result.add(array.removeAt(i))
            }
        }
    }

    println(result[k - 1])
}


//이 알고리즘은 다음과 같다.
//
//2부터 N까지 모든 정수를 적는다.
//아직 지우지 않은 수 중 가장 작은 수를 찾는다. 이것을 P라고 하고, 이 수는 소수이다.
//P를 지우고, 아직 지우지 않은 P의 배수를 크기 순서대로 지운다.
//아직 모든 수를 지우지 않았다면, 다시 2번 단계로 간다.
//N, K가 주어졌을 때, K번째 지우는 수를 구하는 프로그램을 작성하시오.