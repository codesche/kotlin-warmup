package roadtopro251028

// 리스트에서 짝수만 필터링하고 제곱하기
fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6)

    // 짝수만 골라 제곱한 뒤 출력
    numbers
        .filter { it % 2 == 0 }     // 조건 걸러내기
        .map { it * it }            // map은 변환
        .forEach { println(it) }    // forEach는 반복 출력
}