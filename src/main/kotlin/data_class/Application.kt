package data_class

class Application(val name: String) {
    object Utilities {
        fun hello(name: String){
            println("Hello $name")
        }
    }

    companion object{
        fun sayHello(name: String){
            println("Hello $name")
        }
    }
}