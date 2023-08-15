package data_class

open class Guru(val nama: String) {
    protected fun sayHello(name: String) {
        println("Hello $name, my name is ${this.nama}")
    }

}