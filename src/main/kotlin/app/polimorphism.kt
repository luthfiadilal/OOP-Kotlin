package app

import data_class.Employe
import data_class.Manager

fun main() {
    var employe : Employe = Employe("Luthfi")
    employe.sayHello("Alex")

    employe = Manager("Adilal")
    employe.sayHello("Alex")


}