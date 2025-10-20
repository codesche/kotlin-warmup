package roadtopro251020

fun main() {
    val names = listOf("Jonathan", "Minsung", "James")

    for (name in names) {
        println("Hello, $name!")
    }

    var i = 0
    while (i < 3) {
        println("while 반복: ${i + 1}")
        i++
    }

}