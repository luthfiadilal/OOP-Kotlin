package app

import data_class.User

fun User.absen(attend : Int, sick: Int, alpha: Int) {


    if (attend > 80 && sick < 10 && alpha < 5) {
        println("${this.name} dapat THR")
    } else if (attend < 80 && sick < 10 && alpha == 0) {
        println("${this.name} bisa di pertimpbangkan")
    } else {
        println("${this.name} tidak dapat THR")
    }

}

val User.upperName: String
    get() = this.name.toUpperCase()

fun main() {
    val user = User("Luthfi", 22)
    println(user.upperName)
    user.absen(70, 5, 0)

}