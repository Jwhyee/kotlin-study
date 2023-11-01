fun main(args: Array<String>) {
    val stringValue = "one line string test"
    val multiLineStringValue = """
        multiline
        string
        test
    """

    println("stringValue = ${stringValue}")
    println("multiLineStringValue = ${multiLineStringValue}")
}