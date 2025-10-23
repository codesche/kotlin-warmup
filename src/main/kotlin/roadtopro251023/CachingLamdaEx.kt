package roadtopro251023

/**
 * 캐싱 + 람다식 기반 메모이제이션 (피보나치)
 * - getOrPut으로 간단히 메모이제이션 구현
 * - 실무 예: 재귀 계산 최적화, 반복 쿼리/계산 결과 캐시
 */
fun memoizedFibonacci(): (Int) -> Long {
    val cache = mutableMapOf(0 to 0L, 1 to 1L)
    lateinit var fib: (Int) -> Long
    fib = { n ->
        cache.getOrPut(n) { fib(n - 1) + fib(n - 2) }
    }
    return fib
}

fun main() {
    val fib = memoizedFibonacci()
    println("피보나치(10) = ${fib(10)}")
    println("피보나치(40) = ${fib(40)}")
}