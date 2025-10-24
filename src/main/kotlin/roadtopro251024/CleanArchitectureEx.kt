package roadtopro251024

/**
 * UseCase가 규칙을 담고, Repository가 의존성을 뒤집어 외부(저장소)를 교체 가능하게 만든다
 */

// Domain
data class Book(val id: Long, val title: String, val rating: Double)

// 추상화
interface BookRepository {
    fun findAll(): List<Book>
}

// 애플리케이션 규칙 (UseCase)
class GetTopBooks(private val repo: BookRepository) {
    operator fun invoke(limit: Int): List<Book> =
        repo.findAll()
            .sortedByDescending { it.rating }
            .take(limit)
}

// Adapter (구현체)
class InMemoryBookRepository(private val data: List<Book>) : BookRepository {
    override fun findAll(): List<Book> = data
}

fun main() {
    val repo = InMemoryBookRepository(
        listOf(
            Book(1, "Kotlin in Action", 4.8),
            Book(2, "Effective Java", 4.9),
            Book(3, "Clean Code", 4.7),
        )
    )
    val getTopBooks = GetTopBooks(repo)
    println("TOP2 : " + getTopBooks(2))
}