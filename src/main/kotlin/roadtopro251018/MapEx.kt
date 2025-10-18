package roadtopro251018

fun main() {
    val scores = mapOf("Alice" to 90, "Bob" to 82, "Charlie" to 95)
    for ((name, score) in scores) {
        println("$name 의 점수는 $score 점입니다.")
    }
}