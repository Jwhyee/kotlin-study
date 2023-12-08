package example.inflearn_starter.chap2.lect8

fun main() {
    repaet("Hello")
    repaet("Hello", 3)
    repaet("Hello", 3, false)

    repaet("Hello", useNewLine = false)

    printNameAndGender("Female", "최홍만")
    printNameAndGender(gender = "Female", name = "최홍만")
//    FunctionTest.repeat(str = "Hello", 1, false)

    printAll("Hello", "World", "!")

    val arr = arrayOf("Hello", "World", "!")
    printAll(*arr)
}

fun max(a: Int, b: Int): Int = if (a > b) a else b

fun repaet(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

fun printNameAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}

fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}