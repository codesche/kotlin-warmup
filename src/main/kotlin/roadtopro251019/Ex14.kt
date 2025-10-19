package roadtopro251019

import java.io.File

// use {} 블록 덕분에 자원 자동 해제 (try-with-resource 유사)
// 대용량 쓰기 파일에도 안정적임
fun main() {
    val lines = listOf("첫 번째 줄", "두 번째 줄", "세 번째 줄")
    File("multi.txt").bufferedWriter().use { writer ->
        lines.forEach { line ->
            writer.write(line)
            writer.newLine()
        }
    }
    println("여러 줄 파일 생성 완료 (bufferedWriter 방식)")
}