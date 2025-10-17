package roadtopro251017

fun main() {
    val numbers = listOf(3, 7, 10, 12, 18, 21)
    for (num in numbers) {
        if (num % 3 == 0) {
            println("$num 은(는) 3의 배수입니다.")
        }
    }
}