package data_class

class Bos(val name: String) {

    inner class Asisten(val name: String){

        fun hi(){
            println("Hi ${this@Bos.name}, my name is $name")
        }
    }
}