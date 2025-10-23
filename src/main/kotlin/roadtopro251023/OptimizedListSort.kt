package roadtopro251023

/**
 * distinct() + sorted()로 O(n log n) 정렬 & 중복 제거.
 * 실무 예: 유저 ID 목록 정제, 로그 중복 제거 등.
 */
fun main() {
    val numbers = listOf(5, 3, 9, 3, 1, 5 ,7)
    val uniqueSorted = numbers.distinct().sorted()      // 정렬 및 중복 제거
    println("중복 제거 및 정렬 결과: $uniqueSorted")
}