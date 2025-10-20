package roadtopro251020

fun main() {
    val score = (0..100).random()

    println("점수: $score")
    if (score >= 90) {
        println("등급: A")
    } else if (score >= 80) {
        println("등급: B")
    } else if (score >= 70) {
        println("등급 C")
    } else {
        println("등급 F")
    }

    // when 문으로 변환
    val grade = when (score / 10) {
        10, 9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "F"
    }

    println("when문 등급: $grade")

}