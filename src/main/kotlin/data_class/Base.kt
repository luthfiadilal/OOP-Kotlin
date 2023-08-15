package data_class

interface Base {
    fun gretting(name: String)
}

class MyBase: Base {
    override fun gretting(name: String) {
        println("Good $name")
    }
}