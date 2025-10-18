package roadtopro251018

fun main() {
    val fruits = listOf("apple", "banana", "cherry", "avocado")
    val filtered = fruits.filter { it.startsWith("a") }
    println("A로 시작하는 과일: $filtered")
}