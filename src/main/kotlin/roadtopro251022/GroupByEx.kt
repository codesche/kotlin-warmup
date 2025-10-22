package roadtopro251022

data class Order(val userId: Long, val amount: Long)

fun main() {
    val orders = listOf(
        Order(1, 1200),
        Order(1, 800),
        Order(2, 1000),
        Order(2, 300),
        Order(2, 700)
    )

    val countByUser = orders.groupBy { it.userId }.mapValues { it.value.size }
    val sumByUser = orders.groupBy { it.userId }.mapValues { it.value.sumOf { o -> o.amount } }
    val avgByUser = orders.groupBy { it.userId }.mapValues { it.value.map { o -> o.amount }.average() }

    println(countByUser)
    println(sumByUser)
    println(avgByUser)
}