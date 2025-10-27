package roadtopro251027

// 가장 많이 등장한 단어 찾기
fun main() {
    val words = listOf(
        "Kotlin", "is", "fun", "kotlin", "Warmup", "warmup", "WARMUP", "practice", "is", "great"
    )
    val topN = 3

    val result = topNFrequentWords(words, topN)
    println(result)     // [warmup, is, kotlin]
}

fun topNFrequentWords(words: List<String>, n: Int): List<String> {
    return words
        .map { it.trim().lowercase() }      // 모든 단어를 소문자로 변환하고, 공백, 빈 문자열 제거
        .filter { it.isNotEmpty() }
        .groupingBy { it }.eachCount()      // 단어별 등장 횟수 카운트
        .entries
        .sortedWith(                        // 등장 횟수 내림차순 정렬, 등장 횟수가 같은 빈도인 경우 오름차순 정렬
            compareByDescending<Map.Entry<String, Int>> { it.value }
            .thenBy { it.key })
        .take(n)                            // 상위 n개만 선택
        .map { it.key }                     // 단어만 추울
}