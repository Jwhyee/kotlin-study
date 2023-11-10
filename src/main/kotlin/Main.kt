fun main() {
    val arr = intArrayOf(6, 3, 7, 8, 2)
    println(arr)
    printSorted(*arr)
}

fun printSorted(vararg items: Int) {
    println(items)
    items.sort()
    println("items = ${items.contentToString()}")
}
