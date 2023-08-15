package data_class

class Human(nama: String): Interaction, Run, Sleep, MoveA, MoveB {
    override val name: String = nama
    override fun sayHello(name: String) {
        println("Hello $name, my name is ${this.name}")

    }

    override fun run() {
        println("$name is Running")
    }

    override fun move() {
        println("${this.name} is Moving")
    }




}