package kotlinStudy.introduction.day08

import kotlin.math.abs

/**
https://school.programmers.co.kr/learn/courses/30/lessons/181916?language=kotlin
 *문제 설명
 * 1부터 6까지 숫자가 적힌 주사위가 네 개 있습니다.
 * 네 주사위를 굴렸을 때 나온 숫자에 따라 다음과 같은 점수를 얻습니다.
 *
 * 네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p점을 얻습니다.
 * 세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q)^2 점을 얻습니다.
 * 주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p, q(p ≠ q)라고 한다면 (p + q) × |p - q|점을 얻습니다.
 * 어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r(q ≠ r)이라면 q × r점을 얻습니다.
 * 네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자 만큼의 점수를 얻습니다.
 * 네 주사위를 굴렸을 때 나온 숫자가 정수 매개변수 a, b, c, d로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.
 *
 * 제한사항
 * a, b, c, d는 1 이상 6 이하의 정수입니다.
 *
 * 입출력 예
     * a	b	c	d	result
     * 2	2	2	2	2222
     * 4	1	4	4	1681
     * 6	3	3	6	27
     * 2	5	2	6	30
     * 6	4	2	5	2
 * 입출력 예 설명
     * 입출력 예 #1
        * 예제 1번에서 네 주사위 숫자가 모두 2로 같으므로 1111 × 2 = 2222점을 얻습니다. 따라서 2222를 return 합니다.
     * 입출력 예 #2
        * 예제 2번에서 세 주사위에서 나온 숫자가 4로 같고 나머지 다른 주사위에서 나온 숫자가 1이므로 (10 × 4 + 1)2 = 412 = 1681점을 얻습니다. 따라서 1681을 return 합니다.
     * 입출력 예 #3
        * 예제 3번에서 a, d는 6으로, b, c는 3으로 각각 같으므로 (6 + 3) × |6 - 3| = 9 × 3 = 27점을 얻습니다. 따라서 27을 return 합니다.
     * 입출력 예 #4
        * 예제 4번에서 두 주사위에서 2가 나오고 나머지 다른 두 주사위에서 각각 5, 6이 나왔으므로 5 × 6 = 30점을 얻습니다. 따라서 30을 return 합니다.
     * 입출력 예 #5
         * 예제 5번에서 네 주사위 숫자가 모두 다르고 나온 숫자 중 가장 작은 숫자가 2이므로 2점을 얻습니다. 따라서 2를 return 합니다.
 */

class Solution82 {

    fun solution(a: Int, b: Int, c: Int, d: Int): Int {
        val map = listOf(a, b, c, d)
            .groupingBy { it }
            .eachCount()
            .entries
            .sortedByDescending { it.value }

        return when (map.size) {
            1 -> 1111 * map[0].key

            2 -> if (map[0].value == 3) {
                val (p, q) = map.map { it.key }
                (10 * p + q) * (10 * p + q)
            } else {
                val (p, q) = map.map { it.key }
                (p + q) * abs(p - q)
            }

            3 -> map.filter { it.value == 1 }
                .map { it.key }
                .reduce { acc, i -> acc * i }

            else -> map.minOf { it.key }
        }
    }

    /*
    fun solution(a: Int, b: Int, c: Int, d: Int): Int {
        val map = listOf(a, b, c, d).groupingBy { it }.eachCount()
        return when (map.maxOf { it.value }) {
            4 -> a * 1111
            3 -> {
                val p = map.entries.first { it.value == 3 }.key
                val q = map.entries.first { it.value == 1 }.key
                (10 * p + q).let { it * it }
            }
            2 -> {
                if (map.size == 2) {
                    val p = map.entries.first { it.value == 2 }.key
                    val q = map.entries.last { it.value == 2 }.key
                    (p + q) * abs(p - q)
                } else {
                    map.entries.filter { it.value != 2 }
                        .map { it.key }
                        .reduce { acc, n -> acc * n }
                }
            }
            else -> map.minOf { it.key }
        }
    }
    */

    /*
    fun solution(a: Int, b: Int, c: Int, d: Int): Int {
        val map = mutableMapOf<Int, Int>()
        map[a] = map.getOrDefault(a, 0) + 1
        map[b] = map.getOrDefault(b, 0) + 1
        map[c] = map.getOrDefault(c, 0) + 1
        map[d] = map.getOrDefault(d, 0) + 1

        val descValueMapList = map.toList().sortedByDescending { it.second }

        return when (map.size) {
            1 -> a * 1111
            2 -> {
                val (x, y) = descValueMapList.toMap().keys.toIntArray()
                if (descValueMapList[0].second == 2) (x + y) * (abs(x - y))
                else (10 * x + y) * (10 * x + y)
            }
            3 -> descValueMapList.filter { it.second == 1 }.fold(1) { acc, pair -> acc * pair.first }
            else -> map.keys.minOrNull()!!
        }
    }
    */
}

fun main() {
    println(Solution82().solution(6,4,2,5))
}
