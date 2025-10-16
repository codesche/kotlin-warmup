package roadtopro251016

fun main() {
    val day = 3
    val dayName = when (day) {
        1 -> "월요일"
        2 -> "화요일"
        3 -> "수요일"
        4 -> "목요일"
        5 -> "금요일"
        6, 7 -> "주말"
        else -> "잘못된 입력"
    }
    println("오늘은 $dayName 입니다.")
}