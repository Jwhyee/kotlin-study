package example.chapter4.chap4_3

import example.util.prefix

fun main() {
    val name = readlnOrNull()  ?: return
    println("$prefix $name")
}