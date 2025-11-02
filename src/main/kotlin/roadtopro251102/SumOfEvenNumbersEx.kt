package roadtopro251102

// 251102(2) - 짝수 합
fun main() {
    print("N을 입력하세요: ")
    val n = readLine()?.toIntOrNull() ?: 0
    val sum = (1..n).filter { it % 2 == 0 }.sum()
    println("1부터 $n 까지의 짝수 합: $sum")
}