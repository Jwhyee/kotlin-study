package example.inflearn_starter.chap2.lect6

fun main() {
    val numbers = listOf(1L, 2L, 3L)

    for (number in numbers) {
        println(number)
    }

    for (i in 1..3) {
        println(i)
    }

    for (i in 3 downTo 1) {
        println(i)
    }

    for (i in 1 .. 5 step 2) {
        println(i)
    }

    val intRange: IntRange = 1..5
    val intProgression: IntProgression = intRange.step(2)
}