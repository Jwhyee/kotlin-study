package example.inflearn_starter.chap3.lect10

abstract class Animal(
    protected val species: String,
    protected open val legCount: Int
) {
    abstract fun move()
}