package roadtopro251019

// try 자체가 값을 반환하는 식(expression) 으로 동작
// Java보다 훨씬 간결하게 예외 처리 가능
fun main() {
    val result = try {
        "100".toInt()
    } catch (e: NumberFormatException) {
        -1
    }
    println("변환 결과: $result")
}