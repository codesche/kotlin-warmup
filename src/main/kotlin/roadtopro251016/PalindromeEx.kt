package roadtopro251016

// 회문(Palindrome) 판별
// 문자열 비교 및 조건문 없이 표현식으로 작성
fun main() {
    val word = "level"
    val isPalindrome = word == word.reversed()
    println("$word -> 회문인가요? $isPalindrome")
}