package roadtopro251016

fun main() {
    val score = 85
    val grade = if (score >= 90) "A"
    else if (score >= 80) "B"
    else if (score >= 70) "C"
    else "F"

    println("점수: $score -> 학점: $grade")
}