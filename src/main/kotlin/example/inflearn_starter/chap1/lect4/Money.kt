package example.inflearn_starter.chap1.lect4

data class Money(
    val amount: Long
) {
    operator fun plus(other: Money): Money {
        return Money(this.amount + other.amount)
    }
}
