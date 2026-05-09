package kotlinStudy.introduction.day13

/**
https://school.programmers.co.kr/learn/courses/30/lessons/181889?language=kotlin
 *문제 설명
 * 정수 리스트 num_list와 정수 n이 주어질 때,
 * num_list의 첫 번째 원소부터 n 번째 원소까지의 모든 원소를 담은 리스트를 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
     * 2 ≤ num_list의 길이 ≤ 30
     * 1 ≤ num_list의 원소 ≤ 9
     * 1 ≤ n ≤ num_list의 길이 ___
 * 입출력 예
     * num_list	        n	result
     * [2, 1, 6]	    1	[2]
     * [5, 2, 1, 7, 5]	3	[5, 2, 1]
 * 입출력 예 설명
     * 입출력 예 #1
         * [2, 1, 6]의 첫 번째 원소부터 첫 번째 원소까지의 모든 원소는 [2]입니다.
     * 입출력 예 #2
         * [5, 2, 1, 7, 5]의 첫 번째 원소부터 세 번째 원소까지의 모든 원소는 [5, 2, 1]입니다.
 */

class Solution134 {
    fun solution(num_list: IntArray, n: Int): IntArray {
        return num_list.dropLast(num_list.size - n).toIntArray()
    }

    /*
    fun solution(num_list: IntArray, n: Int): IntArray {
        return num_list.take(n).toIntArray()
    }
    */

    /*
    fun solution(num_list: IntArray, n: Int): IntArray {
        return num_list.copyOfRange(0, n)
//        return num_list.sliceArray(0 until n)
    }
    */
}

fun main() {
    println(Solution134().solution(intArrayOf(5, 2, 1, 7, 5), 3).joinToString(", "))
    println(Solution134().solution(intArrayOf(2, 1, 6), 1).joinToString(", "))
}
