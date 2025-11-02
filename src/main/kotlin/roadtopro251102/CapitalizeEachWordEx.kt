package roadtopro251102

// 251102(3) - 단어의 첫 글자만 대문자로
fun main() {
    print("문장을 입력하세요: ")
    val input = readLine() ?: ""
    val result = input
        .split(" ")
        .joinToString(" ") { word ->
            if (word.isNotEmpty()) {
                word.replaceFirstChar { it.uppercase() }
            } else word
        }
    println(result)
}