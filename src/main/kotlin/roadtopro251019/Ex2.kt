package roadtopro251019

class Car(val brand: String, val year: Int) {
    init {      // 이 블록은 객체 생성 시 항상 실행
        println("자동차 생성됨: $brand ($year")
    }

    // 보조 생성자는 오버로딩 느낌 표현 가능
    constructor(brand: String) : this(brand, 2025) {
        println("보조 생성자 호출: 기본 연식 2025 적용")
    }
}

fun main() {
    val car1 = Car("Hyundai", 2024)
    val car2 = Car("Kia")
}