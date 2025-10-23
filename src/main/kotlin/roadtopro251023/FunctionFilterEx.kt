package roadtopro251023

/**
 * 확장 함수로 유틸리티화, average()와 filter() 조합.
 * 실무 예: 매출 상위, 점수 상위, 리더보드 필터링.
 */
fun List<Int>.filterAboveAverage(): List<Int> {
    val avg = this.average()
    return this.filter { it > avg }
}

fun main() {
    val scores = listOf(70, 85, 90, 60, 100, 80)
    val highScores = scores.filterAboveAverage()
    println("평균 초과 점수: $highScores")
}