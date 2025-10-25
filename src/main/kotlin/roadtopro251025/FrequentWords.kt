package roadtopro251025

/**
 * 가장 많이 등장한 단어 찾기
 * - 문자열 리스트가 주어졌을 때, 가장 자주 등장한 단어 출력
 * (단, 등장 횟수가 같으면 사전순으로 앞선 단어 출력)
 *
 * groupingBy + eachCount() 로 빈도 계산
 * maxWith으로 조건 정렬
 */
fun main() {
    val words = listOf("apple", "banana", "apple", "orange", "banana", "apple")
    val mostFrequent = words
        .groupingBy { it }
        .eachCount()            // 단어별 등장 횟수 계산
        .maxWith(compareBy(
            { it.value },           // 등장 횟수 우선
            { -it.key[0].hashCode() }            // 사전순 오름차순 유지, 정렬 방향 뒤집기 위해 '-' 붙임
        )).key

    println(mostFrequent)           // apple
}