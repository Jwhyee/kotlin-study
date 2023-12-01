package example.inflearn_starter.chap1.lect4

fun main() {
    val m1 = JavaMoney(1_000L)
    val m2 = m1
    val m3 = JavaMoney(1_000L)

    println(m1 === m2)
    println(m1 == m3)

    if (m1 > m3) {
        println("m1이 m2보다 크다.")
    }

    // Lazy 연산
    if (function1() || function2()) {
        println("본문")
    }
}

fun function1(): Boolean {
    println("fun 1")
    return true
}

fun function2(): Boolean {
    println("fun 2")
    return true
}