package kotlinStudy.introduction.day21


/**
https://school.programmers.co.kr/learn/courses/30/lessons/181850?language=kotlin
 *문제 설명
 * 실수 flo가 매개 변수로 주어질 때, flo의 정수 부분을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
    * 0 ≤ flo ≤ 100
 * 입출력 예
     * flo	    result
     * 1.42	    1
     * 69.32	69
 * 입출력 예 설명
     * 입출력 예 #1
         * 1.42의 정수 부분은 1입니다.
     * 입출력 예 #2
         * 69.32의 정수 부분은 69입니다.
 */

class Solution213 {
    fun solution(flo: Double): Int {
        return Math.floor(flo).toInt()
    }

    /*
    fun solution(flo: Double): Int {
        return flo.toInt()
    }
    */
}

fun main() {
    println(Solution213().solution(1.42))
    println(Solution213().solution(69.32))
    println(Solution213().solution(69.92))
}
