package roadtopro251023

import java.util.*

/**
 * LinkedHashMap + accessOrder=true 로 간단히 LRU 구현
 * 실무 예: API 결과 캐싱, DB 조회 결과 임시 보관, 세션 관리
 */
class LRUCache<K, V>(private val capacity: Int) {
    private val cache = object : LinkedHashMap<K, V>(capacity, 0.75f, true) {
        override fun removeEldestEntry(eldest: MutableMap.MutableEntry<K, V>?) =
            size > capacity
    }

    fun get(key: K): V? = cache[key]
    fun put(key: K, value: V) {
        cache[key] = value
    }

    override fun toString(): String = cache.toString()
}

fun main() {
    val lru = LRUCache<Int, String>(3)
    lru.put(1, "A")
    lru.put(2, "B")
    lru.put(3, "C")
    lru.get(1)          // 1번이 최근 사용됨
    lru.put(4, "D")     // 가장 오래된 2번 제거
    println("LRU 상태: $lru")
}

