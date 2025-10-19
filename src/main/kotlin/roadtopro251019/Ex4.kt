package roadtopro251019

// 상속과 오버라이딩

// open을 붙여야 상속(extends)과 오버라이드가 가능
// Kotlin은 기본적으로 final class 구조이므로 open 필수
open class Animal(val name: String) {
    open fun sound() {
        println("$name: ???")
    }
}

class Dog(name: String) : Animal(name) {
    override fun sound() {
        println("$name: 멍멍!")
    }
}

fun main() {
    val dog = Dog("초코")
    dog.sound()
}