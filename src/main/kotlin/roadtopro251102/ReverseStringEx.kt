package roadtopro251102

// 251102(1) - 문자열 뒤집기
fun main() {
    print("문자열을 입력하세요: ")
    val input = readLine() ?: ""
    val reversed = input.reversed()         // reversed(), 기본적으로 제공하는 확장 함수
    println("뒤집은 결과: $reversed")
}