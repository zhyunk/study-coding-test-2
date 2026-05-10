package kotlinStudy.introduction.day21

/**
https://school.programmers.co.kr/learn/courses/30/lessons/181849?language=kotlin
 *문제 설명
 * 한 자리 정수로 이루어진 문자열 num_str이 주어질 때, 각 자리수의 합을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
    * 3 ≤ num_str ≤ 100
 * 입출력 예
     * num_str	    result
     * "123456789"	45
     * "1000000"	1
 * 입출력 예 설명
     * 입출력 예 #1
         * 문자열 안의 모든 숫자를 더하면 45가 됩니다.
     * 입출력 예 #2
         * 문자열 안의 모든 숫자를 더하면 1이 됩니다.
 */

class Solution214 {
    fun solution(num_str: String): Int {
        return num_str.map { it.digitToInt() }.sum()
    }
    /*
    fun solution(num_str: String): Int {
        return num_str.split("").filter(String::isNotBlank).map(String::toInt).sum()
    }
    */
    /*
    fun solution(num_str: String): Int {
        return num_str.split("").filter(String::isNotBlank).fold(0) { acc, s -> acc + s.toInt() }
    }
    */
}

fun main() {
    println(Solution214().solution("123456789"))
    println(Solution214().solution("1000000"))
}
