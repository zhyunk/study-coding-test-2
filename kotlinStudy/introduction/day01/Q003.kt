package kotlinStudy.introduction.day01

/**
https://school.programmers.co.kr/learn/courses/30/lessons/181950?language=kotlin
 * 문제 설명
 * 문자열 str과 정수 n이 주어집니다.
 * str이 n번 반복된 문자열을 만들어 출력하는 코드를 작성해 보세요.
 *
 * 제한사항
   1 ≤ str의 길이 ≤ 10
   1 ≤ n ≤ 5

 * 입출력 예
   입력 #1
       string 5
   출력 #1
       stringstringstringstringstring
 */

fun main(args: Array<String>) {
    readLine()!!.split(' ').let {
        println(it[0].repeat(it[1].toInt()))
    }
}

/*
fun main(args: Array<String>) {
    val input = readLine()!!.split(' ')
    val s1 = input[0]
    val a = input[1]!!.toInt()

    println(s1.repeat(a))
}
*/

/*
fun main(args: Array<String>) {
    val input = readLine()!!.split(' ')
    val s1 = input[0]
    val a = input[1]!!.toInt()
    var result = ""

    repeat(a) {
        result += s1
    }

    println(result)
}
*/
