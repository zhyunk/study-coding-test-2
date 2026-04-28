package kotlinStudy.introduction.day01

/**
https://school.programmers.co.kr/learn/courses/30/lessons/181951?language=kotlin
 * 문제 설명
 * 정수 a와 b가 주어집니다. 각 수를 입력받아 입출력 예와 같은 형식으로 출력하는 코드를 작성해 보세요.
 *
 * 제한사항
 * -100,000 ≤ a, b ≤ 100,000
 *
 * 입출력 예
    입력 #1
        4 5
    출력 #1
        a = 4
        b = 5
 */

fun main(args: Array<String>) {
    readLine()!!.split(' ').filter(String::isNotBlank).let{ println("a = ${it[0]}\nb = ${it[1]}") }
}