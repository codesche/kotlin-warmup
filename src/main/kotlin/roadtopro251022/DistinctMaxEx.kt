package roadtopro251022

data class Price(val sku: String, val value: Int, val ts: Long)

// 중복 제거 + 최신 데이터만 남기기(distinctBy + maxBy)
fun main() {
    val list = listOf(
        Price("A-1", 100, 1000L), Price("A-1", 120, 2000L),
        Price("B-2", 300, 1500L), Price("B-2", 280, 800L)
    )
    val latestBySku = list.groupBy { it.sku }.mapValues { (_, v) -> v.maxBy { it.ts } }.values
    println(latestBySku)        // SKU별 최신만
}