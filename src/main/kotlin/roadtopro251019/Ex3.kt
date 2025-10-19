package roadtopro251019

// Kotlin 클래스의 함수는 기본적으로 public
// return 한 줄이면 '=' 축약 가능
class Calculator {
    fun add(a: Int, b: Int): Int = a + b
    fun sub(a: Int, b: Int): Int = a - b
}

fun main() {
    val calc = Calculator()
    println("5 + 3 = ${calc.add(5, 3)}")
    println("5 - 3 = ${calc.sub(5, 3)}")
}