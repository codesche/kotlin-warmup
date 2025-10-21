package roadtopro251021

// fold / reduce / runningReduce
fun main() {
    val words = listOf("ko", "tlin", "is", "fun")

    // 누적 합: 전체 길이
    val totalLen = words.fold(0) { acc, w -> acc + w.length }
    println("글자 수 총합: $totalLen")

    val nums = listOf(3, 1, 4, 1, 5)

    // reduce: 누적 합(초기값 없이 시작)
    val sum = nums.reduce { acc, n -> acc + n }
    println("reduce 합: $sum")

    // runningReduce: 접두 합 시퀀스
    val prefixSums = nums.runningReduce { acc, n -> acc + n }
    println("접두 합: $prefixSums")
}