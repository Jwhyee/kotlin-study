package example.others.point

fun main(args: Array<String>) {
    class Foo {
        val length = args.size
        inner class Bar {
            val firstArg = args.firstOrNull()
        }
    }
}