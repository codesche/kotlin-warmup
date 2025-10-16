package roadtopro251016

import kotlin.random.Random

// 랜덤 숫자 맞추기 게임
fun main() {
    val answer = Random.nextInt(1, 10)
    println("1~9 사이 숫자를 맞혀보세요!")
    val guess = readln().toInt()

    when {
        guess == answer -> println("정답!")
        guess > answer -> println("너무 커요!")
        else -> println("너무 작아요")
    }

    println("정답은 $answer 였습니다.")

}