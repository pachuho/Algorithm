package silver

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.abs

// 2563
fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val num = br.readLine().toInt()
    val papers = ArrayList<Margin>()
    var overLapping = 0

    repeat(num){
        val token = StringTokenizer(br.readLine())
        papers.add(Margin(token.nextToken().toInt(), token.nextToken().toInt()))
    }

    for(me in papers.indices){
        for(target in papers.indices){
            if(me >= target) continue
            val diffLeft = abs(papers[me].marginLeft - papers[target].marginLeft)
            val diffBottom = abs(papers[me].marginBottom - papers[target].marginBottom)

            if( diffLeft >= 10 || diffBottom >= 10) continue
            overLapping += (10 - diffLeft) * (10 - diffBottom)
        }
    }
    println((num * 10 * 10) - overLapping)

}
data class Margin(val marginLeft: Int, val marginBottom: Int)