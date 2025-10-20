package roadtopro251020

fun main() {
    val greet: (String) -> String = { name -> "안녕, $name!" }
    println(greet("코틀린"))

    fun sum(a: Int, b: Int): Int = a + b
    println("3 + 5 = ${sum(3, 5)}")
}