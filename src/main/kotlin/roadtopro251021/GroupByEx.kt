package roadtopro251021

data class Person(val name: String, val city: String, val age: Int)

fun main() {
    val people = listOf(
        Person("Jonathan", "Seoul", 29),
        Person("Minsung", "Seoul", 31),
        Person("James", "Busan", 27),
        Person("Kay", "Busan", 40),
        Person("Jane", "Seoul", 22)
    )

    // 도서별 인원수
    val countByCity = people.groupBy { it.city }.mapValues { (_, list) -> list.size }
    println("도서별 인원수: $countByCity")

    // 도시별 최고령자
    val oldestByCity = people
        .groupBy { it.city }
        .mapValues { (_, list) -> list.maxByOrNull { it.city }!! }
    println("도시별 최고령자: $oldestByCity")
}