package roadtopro251020

fun main() {
    val numbers = (1..10).toList()

    val evenNumbers = numbers.filter { it % 2 == 0}
    val squared = evenNumbers.map { it * it }

    println("짝수: $evenNumbers")
    println("제곱 결과: $squared")
}