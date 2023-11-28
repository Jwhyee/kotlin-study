package example.book_guide.chapter4.chap4_2

class Name(val firstName: String, val familyName: String?)
class Person(val name: Name?) {
    fun introduce(): String {
        val currentName = name ?: return "Unknown"
        return "${currentName.firstName} ${currentName.familyName}"
    }
}

fun main() {
    sayHello(null)
    println(Person(Name("John", "Doe")).introduce())
    println(Person(null).introduce())
}

fun sayHello(name: String?) {
    println("Hello, " + (name ?: "Unknown"))
}