package roadtopro251016

// 나이에 따른 요금 할인 조건
fun main() {
    val age = 14
    val price = 10000
    val discount = when {
        age < 13 -> 0.5                  // 어린이 50% 할인
        age in 13..18 -> 0.8      // 청소년 20% 할인
        else -> 1.0                     // 일반 요금
    }
    val finalPrice = (price * discount).toInt()
    println("나이: $age 세 -> 요금: ${finalPrice}원")
}