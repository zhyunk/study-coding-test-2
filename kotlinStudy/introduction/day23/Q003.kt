package kotlinStudy.introduction.day23

/**
https://school.programmers.co.kr/learn/courses/30/lessons/181840?language=kotlin
 *문제 설명
 * 정수 리스트 num_list와 찾으려는 정수 n이 주어질 때, num_list안에 n이 있으면 1을 없으면 0을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
     * 3 ≤ num_list의 길이 ≤ 100
     * 1 ≤ num_list의 원소 ≤ 100
     * 1 ≤ n ≤ 100
 * 입출력 예
     * num_list	            n	result
     * [1, 2, 3, 4, 5]	    3	1
     * [15, 98, 23, 2, 15]	20	0
 * 입출력 예 설명
     * 입출력 예 #1
         * [1, 2, 3, 4, 5] 안에 3이 있으므로 1을 return합니다.
     * 입출력 예 #2
         * [15, 98, 23, 2, 15] 안에 20이 없으므로 0을 return합니다.
 */

class Solution233 {
    fun solution(num_list: IntArray, n: Int): Int {
        return if (n in num_list) 1 else 0
    }
    /*
    fun solution(num_list: IntArray, n: Int): Int {
        return if (num_list.contains(n)) 1 else 0
    }
    */
}

fun main() {
    println(Solution233().solution(intArrayOf(1, 2, 3, 4, 5), 3))
    println(Solution233().solution(intArrayOf(15, 98, 23, 2, 15), 20))
}
