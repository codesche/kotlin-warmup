package roadtopro251021

data class User(val id: Int, val name: String)

fun main() {
    val users = listOf(User(1, "Alpha"), User(2, "Beta"), User(3, "Gamma"))

    // name -> User 인덱스 맵
    val byName: Map<String, User> = users.associateBy { it.name }
    println(byName["Beta"])

    val tags = listOf("kotlin", "spring", "redis")

    // 단어 -> 길이
    val lengths: Map<String, Int> = tags.associateWith { it.length }
    println(lengths)
}