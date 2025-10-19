package roadtopro251019

// 데이터 클래스
data class User(val id: Int, val name: String)

// data class는 equals, hashCode, toString, copy 자동 생성
// Kotlin의 대표적인 간결 문법 중 하나
fun main() {
    val user1 = User(1, "Alice")
    val user2 = User(1, "Alice")
    println("user1 == user2 ? ${user1 == user2}")       // true
    println("복사본: ${user1.copy(name = "Bob")}")
}