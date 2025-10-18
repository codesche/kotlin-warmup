package roadtopro251018
// 기본값(default) + 이름 지정 인자(named argument)
fun introduce(name: String = "Guest", age: Int = 20) {
    println("이름: $name, 나이: $age")
}

fun main() {
    introduce()     // 기본값 사용
    introduce(age = 30, name = "Minsung")       // 순서 바꿔도 OK, 순서는 자유 (Kotlin의 강점)
}