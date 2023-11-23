package example.chapter4.chap4_4

fun describe(app : Application) = app.name

fun main() {
    val args = arrayOf("Matin Kim")
    val app = Application.Factory.create(args) ?: return
    println("Application strated : $app")
}