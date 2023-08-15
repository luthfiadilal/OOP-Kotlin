package data_class

class Manager(name: String) : Employe(name) {
    final override fun sayHello(name: String) {
        println("Hello $name, my name is manager ${this.name}")
    }
}