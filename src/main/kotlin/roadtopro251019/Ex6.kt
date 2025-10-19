package roadtopro251019

// try-catch-finally 구조는 자바와 동일하지만, 표현식으로도 사용 가능 (값을 반환 가능)
fun main() {
    try {
        val result = 10 / 0
        println("결과: $result")
    } catch (e: ArithmeticException) {
        println("예외 발생: ${e.message}")
    } finally {
        println("프로그램 종료")
    }
}