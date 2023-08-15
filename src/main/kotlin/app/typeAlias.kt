package app

import data_class.Informatika

typealias mahasiswa = Informatika
typealias Stringsupplier  = () -> String

fun sayHallo(supplier: Stringsupplier) {
    println("Hello ${supplier()}")
}

fun main() {
    val mahasiswa = mahasiswa(7, "Luthfi", 22)
    mahasiswa.getFullName()

    sayHallo { "Upi" }
}