package roadtopro251021

// zip / upzip + flatMap (카테시안 곱)
fun main() {
    val xs = listOf(1, 2, 3)
    val ys = listOf("A", "B", "C")

    val zipped: List<Pair<Int, String>> = xs.zip(ys)
    println("zip: $zipped")

    val (unzippedX, unzippedY) = zipped.unzip()
    println("unzip X: $unzippedX, Y: $unzippedY")

    // 카테시안 곱: 모든 조합
    val colors = listOf("Red", "Green")
    val sizes = listOf("S", "M", "L")
    val allCombos = colors.flatMap { c -> sizes.map { s -> "$c-$s" } }
    println("모든 조합: $allCombos")
}