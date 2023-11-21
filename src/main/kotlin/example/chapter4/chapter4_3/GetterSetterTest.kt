package example.chapter4.chapter4_3

import java.util.*

class Person(val firstName: String, val familyName: String, age: Int) {
    var lastChanged: Date? = null
        private set
    val fullName
        get() = "$firstName $familyName"
    var age = age
        set(value) {
            if (value != null && value <= 0)
                throw IllegalArgumentException("Invalid age: $value")
            lastChanged = Date()
            field = value
        }
}

fun main() {
    val p = Person("Matin", "Kim", 50)
    println(p.fullName)
    p.age = -1
//    p.lastChanged = Date()
}