package example.book_guide.chapter4.chap4_3

import example.book_guide.others.util.prefix

fun main() {
    val name = readlnOrNull()  ?: return
    println("$prefix $name")
}