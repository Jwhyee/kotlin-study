import kotlin.random.Random

fun main() {
    val num = Random.nextInt(1, 101)
    outer@ while (true) {
        var guess = readln().toInt()

        val msg = when {
            guess < num -> "up"
            guess > num -> "down"
            else -> break@outer
        }
        println(msg)
    }
    println("answer : $num")
}