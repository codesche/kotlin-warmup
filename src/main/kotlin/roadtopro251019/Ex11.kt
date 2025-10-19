package roadtopro251019

import java.io.File

/**
 * File("경로") 로 파일 객체 생성
 * writeText() 로 간단히 문자열 전체를 파일에 씀 (기존 내용 덮어씀)
 */
fun main() {
    val file = File("hello.txt")
    file.writeText("안녕하세요 Kotlin!\n파일 입출력 warm-up 시작")
    println("파일 생성 및 내용 작성 완료")
}