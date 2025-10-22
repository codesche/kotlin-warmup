package roadtopro251022

// 안전한 파라미터 파싱(기본값, 검증)
fun main() {
    val params = mapOf("page" to "3", "size" to "20", "sort" to "name, desc")

    val page = params["page"]?.toIntOrNull()?.coerceAtLeast(1) ?: 1
    val size = params["size"]?.toIntOrNull()?.coerceIn(1, 100) ?: 10

    val (sortField, sortDir) = params["sort"]?.split(",")?.let {
        (it.getOrNull(0) ?: "id") to (it.getOrNull(1) ?: "asc")
    } ?: ("id" to "asc")

    println("page=$page, size=$size, sort=$sortField $sortDir")
}