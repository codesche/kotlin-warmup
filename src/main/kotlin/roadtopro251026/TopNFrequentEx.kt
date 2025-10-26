package roadtopro251026


/**
 * groupingBy + eachCount()	Kotlin의 대표적인 빈도 계산 조합
 * compareByDescending + thenBy	다중 정렬 조건 설정
 * take(n)	상위 N개만 추출
 * entries [Map → List]로 변환해 정렬 가능
 */

fun main() {
    val words = listOf(
        "apple", "banana", "apple", "banana", "orange", "banana",
        "apple", "grape", "banana", "grape", "kiwi"
    )
    val n = 3

    val topwords = words
        .groupingBy { it }
        .eachCount()            // 단어별 등장 횟수 계싼
        .entries
        .sortedWith(            // 등장 횟수 내림차순, 단어 오름차순
            compareByDescending<Map.Entry<String, Int>> { it.value }
                .thenBy { it.key }
        )
        .take(n)    // 상위 N개 추출

    // 결과 출력
    for ((word, count) in topwords) {
        println("$word, ($count 회)")
    }

}