package kotlinStudy.introduction.day10

/**
https://school.programmers.co.kr/learn/courses/30/lessons/181905?language=kotlin
 *문제 설명
 * 문자열 my_string과 정수 s, e가 매개변수로 주어질 때, my_string에서 인덱스 s부터 인덱스 e까지를 뒤집은 문자열을 return 하는 solution 함수를 작성해 주세요.
 *
 * 제한사항
     * my_string은 숫자와 알파벳으로만 이루어져 있습니다.
     * 1 ≤ my_string의 길이 ≤ 1,000
     * 0 ≤ s ≤ e < my_string의 길이
 * 입출력 예
     * my_string	        s	e	result
     * "Progra21Sremm3"	    6	12	"ProgrammerS123"
     * "Stanley1yelnatS"	4	10	"Stanley1yelnatS"
 * 입출력 예 설명
     * 입출력 예 #1
         * 예제 1번의 my_string에서 인덱스 6부터 인덱스 12까지를 뒤집은 문자열은 "ProgrammerS123"이므로 "ProgrammerS123"를 return 합니다.
     * 입출력 예 #2
         * 예제 2번의 my_string에서 인덱스 4부터 인덱스 10까지를 뒤집으면 원래 문자열과 같은 "Stanley1yelnatS"이므로 "Stanley1yelnatS"를 return 합니다.
 */

class Solution103 {
    /*
    fun solution(my_string: String, s: Int, e: Int): String {
        return my_string.substring(0, s - 1) + my_string.slice(s..e).reversed() + my_string.substring(e + 1)
    }
    */

    fun solution(my_string: String, s: Int, e: Int): String {
        return my_string.mapIndexed {index, c -> if (index in s..e) my_string[s + e - index] else c }.joinToString("")
    }

    /*
    fun solution(my_string: String, s: Int, e: Int): String {
        return my_string.indices.joinToString("") { if (it in s..e) "${my_string[s + e - it]}" else "${my_string[it]}" }
    }
    */
}

fun main() {
    println(Solution103().solution("Progra21Sremm3", 6, 12))
    println(Solution103().solution("Stanley1yelnatS", 4, 10))
}
