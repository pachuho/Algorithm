package silver

import kotlin.math.min

// 1244
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val switches = BooleanArray(n) { false }
    readLine()
        .split(" ")
        .forEachIndexed { index, s ->
            switches[index] = (s == "1")
        }

    val t = readLine().toInt()

    for (i in 0 until t) {
        var (gender, idx) = readLine().split(" ").map { it.toInt() }
        idx--

        when(gender) {
            1 -> {
                for (j in idx until n step (idx + 1)) {
                    switches[j] = switches[j].not()
                }
            }
            else -> {
                val min = min(n - (idx + 1), idx)
                for (j in 0..min) {
                    if (j != 0) {
                        if (switches[idx - j] == switches[idx + j]) {
                            switches[idx - j] = switches[idx - j].not()
                            switches[idx + j] = switches[idx + j].not()
                        } else {
                            break
                        }
                    } else {
                        switches[idx] = switches[idx].not()
                    }
                }
            }
        }
    }

    println(
        switches
            .map { if (it) 1 else 0 }
            .chunked(20)
            .joinToString("\n") { it.joinToString(" ") }
    )
}

// input

//첫째 줄에는 스위치 개수가 주어진다. 스위치 개수는 100 이하인 양의 정수이다.
// 둘째 줄에는 각 스위치의 상태가 주어진다.
// 켜져 있으면 1, 꺼져있으면 0이라고 표시하고 사이에 빈칸이 하나씩 있다.
// 셋째 줄에는 학생수가 주어진다.
// 학생수는 100 이하인 양의 정수이다.
// 넷째 줄부터 마지막 줄까지 한 줄에 한 학생의 성별, 학생이 받은 수가 주어진다.
// 남학생은 1로, 여학생은 2로 표시하고, 학생이 받은 수는 스위치 개수 이하인 양의 정수이다. 학
// 생의 성별과 받은 수 사이에 빈칸이 하나씩 있다.

//8
//0 1 0 1 0 0 0 1
//2
//1 3
//2 3

// output

//스위치의 상태를 1번 스위치에서 시작하여 마지막 스위치까지 한 줄에 20개씩 출력한다.
// 예를 들어 21번 스위치가 있다면 이 스위치의 상태는 둘째 줄 맨 앞에 출력한다.
// 켜진 스위치는 1, 꺼진 스위치는 0으로 표시하고, 스위치 상태 사이에 빈칸을 하나씩 둔다.

//1 0 0 0 1 1 0 1