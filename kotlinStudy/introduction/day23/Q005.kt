package kotlinStudy.introduction.day23

/**
https://school.programmers.co.kr/learn/courses/30/lessons/181838?language=kotlin
 *문제 설명
 * 정수 배열 date1과 date2가 주어집니다.
 * 두 배열은 각각 날짜를 나타내며 [year, month, day] 꼴로 주어집니다.
 * 각 배열에서 year는 연도를, month는 월을, day는 날짜를 나타냅니다.
 *
 * 만약 date1이 date2보다 앞서는 날짜라면 1을, 아니면 0을 return 하는 solution 함수를 완성해 주세요.
 *
 * 제한사항
     * date1의 길이 = date2의 길이 = 3
     * 0 ≤ year ≤ 10,000
     * 1 ≤ month ≤ 12
     * day는 month에 따라 가능한 날짜로 주어집니다.
 * 입출력 예
     * date1	        date2	        result
     * [2021, 12, 28]	[2021, 12, 29]	1
     * [1024, 10, 24]	[1024, 10, 24]	0
 * 입출력 예 설명
     * 입출력 예 #1
         * date1이 date2보다 하루 앞서기 때문에 1을 return 합니다.
     * 입출력 예 #2
         * date1과 date2는 날짜가 서로 같으므로 date1이 더 앞서는 날짜가 아닙니다. 따라서 0을 return 합니다.
 */

class Solution235 {
    fun solution(date1: IntArray, date2: IntArray): Int {
        return if (date1[0] * 10000 + date1[1] * 100 + date1[2] < date2[0] * 10000 + date2[1] * 100 + date2[2] ) 1 else 0
    }

    /*
    fun solution(date1: IntArray, date2: IntArray): Int {
        return if (String.format("%05d%02d%02d", date1[0], date1[1], date1[2]).toInt() < String.format("%05d%02d%02d", date2[0], date2[1], date2[2]).toInt() ) 1 else 0
    }
    */
}

fun main() {
    println(Solution235().solution(intArrayOf(2021, 12, 28), intArrayOf(2021, 12, 29)))
    println(Solution235().solution(intArrayOf(1024, 10, 24), intArrayOf(1024, 10, 24)))
}

