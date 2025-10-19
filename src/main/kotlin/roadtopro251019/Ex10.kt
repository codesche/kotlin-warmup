package roadtopro251019

// not-nul 단정(!!) & 안전 변환(toIntOrNull)
// ?., ?:, !! 는 Kotlin null 처리 3대장
fun main() {
    val text: String? = "123"
    val number = text!!.toInt()             // 강제 non-null (null이면 예외 발생)
    println("변환된 숫자: $number")

    val bad = "abc".toIntOrNull()           // 변환 실패 시 null 반환
    println("toIntOrNull 결과 : $bad")
}