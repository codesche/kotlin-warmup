package roadtopro251021

data class Product(val name: String, val category: String, val price: Int)

fun main() {
    val products = listOf(
        Product("Alpha", "Book", 12000),
        Product("Beta", "Book", 8000),
        Product("Gamma", "Toy", 15000),
        Product("Delta", "Toy", 9000),
        Product("Epsilon", "Food", 5000)
    )

    // 카테고리별 '가장 저렴한' 상품만 추리기
    val cheapestPerCategory = products
        .sortedBy { it.price }          // 가격 오름차순 정렬 후
        .distinctBy { it.category }     // 처음 등장(=최저가)만 유지
    println("카테고리별 최저가: $cheapestPerCategory")

    // 다중 정렬: 가격 내림차순 -> 이름 오름차순
    val sorted = products.sortedWith(
        compareByDescending<Product> { it.price }.thenBy { it.name }
    )
    println("다중 정렬 결과: $sorted")
}