package data_class

class Staf(nama: String): Guru(nama) {
    fun sayHello(){
        super.sayHello("Guru")
    }

}