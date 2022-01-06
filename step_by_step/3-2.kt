package step_by_step

import java.util.Scanner
fun main(){
    val sc = Scanner(System.`in`)

    val rep = sc.nextInt()
    for( i in 1..rep ){

        val a = sc.nextInt()
        val b = sc.nextInt()
        println( a + b )
    }
}

//fun main() = with(Scanner(System.`in`)){
//    for(i in 0..nextInt()){
//        println(nextInt() + nextInt())
//    }
//}

// https://www.acmicpc.net/problem/10950