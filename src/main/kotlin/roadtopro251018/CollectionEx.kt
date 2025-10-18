package roadtopro251018

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    val squaredSum = numbers.map { it * it }.filter { it > 10 }.sumOf { it }
    println("10보다 큰 제곱들의 합: $squaredSum")
}