package roadtopro251023

/**
 * groupingBy + eachCount()로 빈도 계산.
 * 실무 예: 로그 키워드 통계, 검색어 랭킹 집계.
 */
fun main() {
    val text = "kotlin kotlin java kotlin python java"
    val frequency = text.split(" ")
        .groupingBy { it }
        .eachCount()
        .toList()
        .sortedByDescending { it.second }

    println("단어 빈도순 정렬: $frequency")
}