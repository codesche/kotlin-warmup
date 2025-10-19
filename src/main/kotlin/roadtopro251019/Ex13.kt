package roadtopro251019

import java.io.File

fun main() {
    val lines = listOf("첫 번째 줄", "두 번째 줄", "세 번째 줄")
    File("multi.txt").writeText(lines.joinToString("\n"))
    println("여러 줄 파일 생성 완료")
}