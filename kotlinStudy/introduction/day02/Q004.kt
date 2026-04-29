package kotlinStudy.introduction.day02

/**
https://school.programmers.co.kr/learn/courses/30/lessons/181944?language=kotlin
 * 문제 설명
 * 자연수 n이 입력으로 주어졌을 때 만약 n이 짝수이면 "n is even"을, 홀수이면 "n is odd"를 출력하는 코드를 작성해 보세요.
 *
 * 제한사항
 * 1 ≤ n ≤ 1,000
 *
 * 입출력 예
     입력 #1
         100
     출력 #1
         100 is even
     입력 #2
         1
     출력 #2
         1 is odd
 */

fun main(args: Array<String>) = readLine()!!.toInt().let {
    val msg = if (it % 2 == 0) "even" else "odd"
    println("$it is $msg")
}

/*
fun main(args: Array<String>) {
    val a = readLine()!!.toInt()
    val msg = if (a % 2 == 0) "even" else "odd"

    println("$a is $msg")
}*/

/*
fun main(args: Array<String>) {
    val a = readLine()!!.toInt()
    println("$a is ${if (a % 2 == 0) "even" else "odd"}")
}
*/
