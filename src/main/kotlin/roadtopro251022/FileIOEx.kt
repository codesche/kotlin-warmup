package roadtopro251022

import java.io.File

fun main() {
    val file = File("notes.txt")

    // 쓰기(덮어쓰기) - 여러 줄은 joinToString 으로
    val lines = listOf("첫 줄", "둘째 줄", "셋째 줄")
    file.writeText(lines.joinToString("\n"))

    // 추가
    file.appendText("\n추가된 줄")

    // 읽기
    val readLines = file.readLines()
    println(readLines)
}