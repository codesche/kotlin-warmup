package roadtopro251018

// 반환값 없는 함수
// Kotlin의 Unit은 Java의 void 역할, 생략 가능
fun printSum(a: Int, b: Int): Unit {
    println("$a + $b = ${a + b}")
}

fun main() {
    printSum(5, 7)
}