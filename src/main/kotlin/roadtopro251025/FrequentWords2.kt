package roadtopro251025

/**
 * 가장 많이 등장한 단어 찾기
 * - 문자열 리스트가 주어졌을 때, 가장 자주 등장한 단어 출력
 * (단, 등장 횟수가 같으면 사전순으로 앞선 단어 출력)
 *
 * groupingBy + eachCount() 로 빈도 계산
 * entries, sortedWith 활용
 * => 다른 풀이
 */
fun main() {
    val words = listOf("apple", "banana", "apple", "orange", "banana", "apple")
    val mostFrequent = words
        .groupingBy { it }
        .eachCount()            // 단어별 등장 횟수 계산
        .entries
        .sortedWith(compareByDescending<Map.Entry<String, Int>> { it.value }
            .thenBy { it.key })         // 등장횟수 ↓, 단어 오름차순
        .first()
        .key

    println(mostFrequent)           // apple
}