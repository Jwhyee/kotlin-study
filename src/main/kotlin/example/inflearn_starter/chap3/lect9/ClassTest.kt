package example.inflearn_starter.chap3.lect9

fun main() {
    val p1 = Person("John Cena", 8)
    println(p1.name)
    p1.age = 13
    println(p1.age)

    val p2 = Person("Ronnie Coleman")
    val p3 = Person()

    val jp = JavaPerson("John Cinema", 7)
    println(jp.name)
    jp.age = 12
    println(jp.age)
}