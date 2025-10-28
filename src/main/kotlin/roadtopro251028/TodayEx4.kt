package roadtopro251028

fun main() {
    val sentence = "Practice makes Kotlin more fun and powerful"

    // 문장을 단어로 나누고, 가장 긴 단어 찾기
    val longestWord = sentence        // val을 사용하여 불변 데이터 다루기
        .trim()                       // 공백 제거
        .split(" ")     // 공백 기준 단어 분리
        .filter { it.isNotEmpty() }   // 조건에 따라 최댓값 찾기
        .maxByOrNull { it.length }

    println("가장 긴 단어: $longestWord")
}