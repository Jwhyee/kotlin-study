package example.inflearn_starter.chap1.lect2

fun main() {
    val str: String? = "ABC"
//    println(str?.length)
    println(str?.length ?: 0)

    val p = Person(null)
    println(startsWithA(p.name))

}

fun startsWithA(str: String): Boolean {
    return str.startsWith("A")
}

fun startsWithA1(str: String?): Boolean {
    if (str == null) throw IllegalArgumentException("null이 들어왔습니다.")
    return str.startsWith("A")
}

fun startsWithA1_2(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null이 들어왔습니다.")
}

fun startsWithA2(str: String?): Boolean? {
    if (str == null) return null
    return str.startsWith("A")
}

fun startsWithA2_1(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    if (str == null) return false
    return str.startsWith("A")
}

fun startsWithA3_1(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

fun calculate(number: Long?): Long {
    number ?: return 0
    return number - 10
}

fun startsWith(str: String?): Boolean {
    return str!!.startsWith("A")
}