package roadtopro251028

// 문자열을 단어 단위로 나누고, 각 단어 길이 출력
fun main() {
    val sentence = "Kotlin is concise and expressive"

    // 앞뒤 공백 제거, 문자열 공백 기준으로 나누기
    val words = sentence.trim().split(" ")

    // 인덱스와 값 동시에 활용
    words.mapIndexed { index, word ->
        println("단어 ${index + 1}: 'word' (길이: ${word.length})")
    }

}