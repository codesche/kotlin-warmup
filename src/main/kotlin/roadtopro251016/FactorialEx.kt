package roadtopro251016

// 팩토리얼 계산 (재귀 + 반복문 두 가지 방식)
fun factorialRecursive(n: Int): Long =
    if (n <= 1) 1 else n * factorialRecursive(n - 1)

fun factorialIterative(n: Int): Long {
    var result = 1L
    for (i in 1..n) result *= i
    return result
}

fun main() {
    val num = 5
    println("재귀 팩토리얼($num): ${factorialRecursive(num)}")
    println("반복문 팩토리얼($num): ${factorialIterative(num)}")
}