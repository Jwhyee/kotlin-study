package example.inflearn_starter.chap1.lect3

import example.inflearn_starter.chap1.lect2.Person

fun main() {
    val num1: Int? = 3
    val num2: Long = num1?.toLong() ?: 0L
    println(num2)

    printNameIfPerson(null)

}

fun printNameIfPerson(obj: Any?) {
    val p = obj as? Person
    println(p?.name ?: "")
}