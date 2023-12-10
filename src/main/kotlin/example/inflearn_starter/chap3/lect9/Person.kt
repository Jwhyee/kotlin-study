package example.inflearn_starter.chap3.lect9

class Person(
    name: String = "홍길동",
    var age: Int = 1,
) {

    var name = name
        set(value) {
            field = value.uppercase()
        }

    init {
        if(age <= 0) throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        println("초기화 블록")
    }

    val isAdult: Boolean
        get() = this.age >= 20

    val uppercaseName: String
        get() = this.name.uppercase()
}