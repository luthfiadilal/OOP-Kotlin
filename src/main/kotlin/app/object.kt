package app

import data_class.Person

fun main() {
    val joko = Person("Joko", "Tingkir")
    val upi = Person("Luthfi", "Adilal", "Mahbub")


    println(upi.firstName)
    println(upi.middleName)
    println(upi.lastName)
    println(upi.getFullName())
    println(upi.sayHello("alex"))
    println(upi.sayHello("alex", "robert"))

    println(joko.firstName)
    println(joko.lastName)




}