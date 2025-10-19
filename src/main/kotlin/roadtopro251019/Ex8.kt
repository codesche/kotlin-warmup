package roadtopro251019

// name이 null이면 length를 호출하지 않고 null 반환
fun main() {
    val name: String? = null
    println("이름 길이: ${name?.length}")       // null이면 실행되지 않음
}