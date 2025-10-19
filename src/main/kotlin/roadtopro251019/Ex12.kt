package roadtopro251019

import java.io.File

/**
 * readText() 로 전체 파일 내용을 문자열로 읽어옴
 * exists() 로 파일 존재 여부 체크 가능
 */
fun main() {
    val file = File("hello.txt")
    if (file.exists()) {
        val content = file.readText()
        println("파일 내용:\n$content")
    } else {
        println("파일이 존재하지 않습니다.")
    }
}