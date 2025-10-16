package roadtopro251016

// 리스트의 짝수 합 구하기
// 컬렉션 함수(filter, sum)을 활용하기
fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    val evenSum = numbers.filter { it % 2 == 0 }.sum()
    println("짝수의 합: $evenSum")
}