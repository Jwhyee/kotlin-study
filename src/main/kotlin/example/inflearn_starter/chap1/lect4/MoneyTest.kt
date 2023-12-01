package example.inflearn_starter.chap1.lect4

fun main() {
    val m1 = Money(1_000L)
    val m2 = Money(2_000L)
    val m3 = m1 + m2
    println(m3)
}