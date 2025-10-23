package roadtopro251023

/**
 * tailrec은 스택 프레임 재사용으로 스택 오버플로 방지 + O(n) 효율
 * 실무 예: 재귀적 트리 탐색, 백트래킹 최적화
 */
tailrec fun factorial(n: Long, acc: Long = 1): Long =
    if (n <= 1) acc else factorial(n - 1, acc * n)

fun main() {
    val result = factorial(10)
    println("팩토리얼 결과: $result")
}
