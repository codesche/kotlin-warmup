package roadtopro251020

import java.io.File

fun main() {
    val file = File("output.txt")

    // 파일 쓰기
    file.writeText("Kotlin Warm-up\n 한 줄씩 추가합니다.\n")

    // 파일 읽기
    val content = file.readText()
    println("파일 내용:\n$content")
}