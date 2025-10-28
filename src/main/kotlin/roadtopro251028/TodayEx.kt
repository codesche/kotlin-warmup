package roadtopro251028

// 문자 개수 세기
/**
 * 문자열이 주어졌을 때, 각 문자가 몇 번 등장했는지를
 * 출력하는 프로그램을 작성
 * 단, 대소문자를 구분하지 않고,
 * 결과는 알파벳 순으로 정렬해서 출력.
 */
fun main() {
    val input = "Hello Kotlin"
    val countMap = mutableMapOf<Char, Int>()

    for (ch in input.lowercase()) {
        if (ch.isLetter()) {
            countMap[ch] = countMap.getOrDefault(ch, 0) + 1
        }
    }

    for ((key, value) in countMap.toSortedMap()) {
        println("$key: $value")
    }
}