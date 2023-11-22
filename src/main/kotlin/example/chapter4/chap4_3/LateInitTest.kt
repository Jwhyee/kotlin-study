package example.chapter4.chap4_3

import java.io.File

fun main() {

}

class Content {
    lateinit var text: String

    fun loadFile(file: File) {
        text = file.readText()
    }
}

fun getContentSize(content: Content) = content.text.length
