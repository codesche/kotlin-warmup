package roadtopro251021

fun main() {
    // 7의 배수의 제곱 중 처음 10개만 계산 (불필요한 중간 리스트 생성 X)
    val first10 = generateSequence(1) { it + 1 }
        .filter { it % 7 == 0 }
        .map { it * it }
        .take(10)
        .toList()

    // 7의 배수 제곱(처음 10개): [49, 196, 441, 784, 1225, 1764, 2401, 3136, 3969, 4900]
    println("7의 배수 제곱(처음 10개): ${first10}")

    // 큰 범위 처리 시 asSequence 사용 예
    // 큰 범위 지연 처리 샘플: [18, 36, 54, 72, 90]
    val big = (1..1_000_000).asSequence()
        .filter { it % 9 == 0 }
        .map { it * 2 }
        .take(5)
        .toList()

    println("큰 범위 지연 처리 샘플: $big")
}