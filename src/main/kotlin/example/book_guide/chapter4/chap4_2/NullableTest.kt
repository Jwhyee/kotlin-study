package example.book_guide.chapter4.chap4_2

fun main() {


    println(isLetterString("abc"))
    // String?를 사용하지 않을 경우 에러 발생
    // error : Null can not be a value of a non-null type String
    println(isLetterString(null))

    println(isBooleanString("true"))
    println(isBooleanString(null))

    println(describeNumber(null))

    val n = readLine()!!.toInt()
    println("n = ${n}")

}

fun isLetterString(s: String?): Boolean {
    if(s == null) return false

    if(s.isEmpty()) return false

    for(ch in s) {
        if(!ch.isLetter()) return false
    }

    return true
}

fun isBooleanString(s: String?) = s == "false" || s == "true"

fun describeNumber(n: Int?) = when(n) {
    null -> "null"
    in 0 .. 10 -> "small"
    in 11 .. 100 -> "large"
    else -> "out of range"
}