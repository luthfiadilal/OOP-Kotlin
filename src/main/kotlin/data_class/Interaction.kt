package data_class

interface Interaction {
    val name: String
    fun sayHello(name: String)
    fun getName() {
        println("Hello my name is ${this.name}")
    }
}