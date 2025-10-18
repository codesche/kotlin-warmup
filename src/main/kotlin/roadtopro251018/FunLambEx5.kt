package roadtopro251018

// 고차함수 - 함수가 다른 함수를 인자로 받는 구조, Kotlin의 함수형 프로그래밍 핵심 개념
fun operate(a: Int, b: Int, op: (Int, Int) -> Int): Int {
    return op(a, b)
}

fun main() {
    val sum = operate(5, 3) { x, y -> x + y }
    val mul = operate(5, 3) { x, y -> x * y }

    println("합: $sum, 곱: $mul")
}
