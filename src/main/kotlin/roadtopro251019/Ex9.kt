package roadtopro251019

// 엘비스(Elvis) 연산자 - ?:
// '?:'는 왼쪽이 null이면 오른쪽 값을 반환, 기본값 처리나 fallback에 자주 사용됨
fun main() {
    val input: String? = null
    val result = input ?: "기본값"
    println(result)
}