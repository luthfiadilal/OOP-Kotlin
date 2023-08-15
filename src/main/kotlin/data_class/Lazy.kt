package data_class

class Lazy {
    val name: String by lazy {
        println("name is call")
        "Lutfi"
    }
}