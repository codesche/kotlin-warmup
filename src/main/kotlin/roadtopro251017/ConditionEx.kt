package roadtopro251017

fun main() {
    var i = 0
    do {
        i++
        if (i % 2 == 0) {
            continue            // 짝수는 건너뜀
        }
        println("현재 값: $i")
        if (i > 7) {
            break;          // i가 7보다 크면 중단
        }
    } while (i < 10)
}