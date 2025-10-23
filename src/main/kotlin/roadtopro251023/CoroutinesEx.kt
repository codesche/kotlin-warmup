package roadtopro251023

import kotlin.system.measureTimeMillis
import kotlinx.coroutines.*

/**
 * async-await 비동기 처리로 병렬 실행 (총합이 아닌 병렬 시간)
 * 실무 예: 다중 API 호출, 비동기 데이터 적재, 대량 IO 병렬 처리
 */
suspend fun fetchData(id: Int): String {
    delay(300L)     // 네트워크 호출 시뮬레이션
    return "Data-$id"
}

fun main() = runBlocking {
    val time = measureTimeMillis {
        val jobs = (1..5).map { async { fetchData(it) }}
        val results = jobs.awaitAll()
        println("결과: $results")
    }
    println("실행 시간: ${time}ms")
}