package roadtopro251024

// 간단 Result 타입
// 포인트: 예외 대신 타입으로 에러 제어, 체이닝(map/flatMap)으로 가독성 + 테스트 용이성 확보.
sealed class R<out T> {
    data class OK<T>(val value: T) : R<T>()
    data class Err(val message: String) : R<Nothing>()
}

inline fun <A, B> R<A>.map(f: (A) -> B): R<B> = when (this) {
    is R.OK -> R.OK(f(this.value))
    is R.Err -> this
}

inline fun <A, B> R<A>.flatMap(f: (A) -> R<B>): R<B> = when (this) {
    is R.OK -> f(value)
    is R.Err -> this
}

// -- 도메인 로직: 가격 파싱 -> 할인 적용 -> 포맷팅 --
fun parsePrice(raw: String): R<Int> =
    raw.toIntOrNull()?.let { R.OK(it) } ?: R.Err("가격 형식이 올바르지 않습니다.")

fun applyDiscount(price: Int): R<Int> =
    if (price >= 10000) R.OK((price * 0.9).toInt()) else R.Err("할인은 1000원 이상부터 적용됩니다.")

fun format(price: Int): String = "최종가: ${price}원"

fun main() {
    val success = parsePrice("1200").flatMap(::applyDiscount).map(::format)
    val fail = parsePrice("abc").flatMap(::applyDiscount).map(::format)

    fun show(result: R<String>) = when (result) {
        is R.OK -> "${result.value}"
        is R.Err -> "${result.message}"
    }

    println(show(success))
    println(show(fail))
}