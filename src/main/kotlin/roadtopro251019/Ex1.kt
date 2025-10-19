package roadtopro251019

// Kotlin의 클래스는 기본 생성자를 한 줄로 선언 가능
class Person(val name: String, val age: Int)

fun main() {
    val person = Person("Jonathan", 20)     // val: 읽기 전용, var: 변경 가능
    println("이름: ${person.name}, 나이: ${person.age}")
}