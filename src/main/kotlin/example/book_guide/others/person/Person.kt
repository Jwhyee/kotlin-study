package example.book_guide.others.person

class Person(val firstName: String, val familyName: String) {
    inner class Possession(val description: String) {
        fun getOwner() = this@Person
    }

    private fun fullName() = "$firstName $familyName"

}

fun main() {
    val p = Person("Martin", "Kim")
    val wallet = p.Possession("Wallet")
    println(wallet.getOwner())
}