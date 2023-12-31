package example.book_guide.others.util

val prefix = "Hello, "

class Util private constructor() {
    fun getRealTime(): Int = 10

    companion object Factory {
        private lateinit var util: Util

        @Synchronized
        fun getUtil(): Util {
            return if(Factory::util.isInitialized) util
            else Util()
        }
    }

}