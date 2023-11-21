package example.chapter4.chapter4_3

import java.io.File

val text by lazy {
    File("data.txt").readText()
}

val text2 get() = File("data.txt").readText()

fun write(content: String) {
    File("data.txt").writeText(content)
}

fun main() {
    while (true) {
        print("input : ")
        when (val cmd = readlnOrNull() ?: return) {
            "p1" -> println(text)
            "p2" -> println(text2)
            "w" -> write(readln())
            "e" -> return
        }
    }
}