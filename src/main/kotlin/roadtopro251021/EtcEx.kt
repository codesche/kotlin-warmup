package roadtopro251021

// partition + chunked + windowed
fun main() {
    val numbers = (1..20).toList()

    // 짝/홀 분할
    val (even, odd) = numbers.partition { it % 2 == 0 }
    println("짝수: $even, 홀수: $odd")

    // 고정 크기 청크
    val chunked5 = numbers.chunked(5)
    println("5개씩 끊기: ${chunked5}")

    // 이동 윈도우 합(크기 3)
    val movingSums = numbers.windowed(size = 3, step = 1, partialWindows = false) { it.sum() }
    println("윈도우 합(3): $movingSums")
}