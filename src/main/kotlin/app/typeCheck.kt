package app

import data_class.Customer
import data_class.Laptop


fun printObject(any: Any){
    if (any is Laptop){
        println("Laptop ${any.name}")
    } else if (any is Customer) {
        println("Customer is ${any.name}, age is ${any.age} and type is ${any.type}")
        println(any.printCustomer())
    } else {
        println(any)
    }
}


fun konversi(any: Any){
    when (any){
        is Laptop -> println("Laptop ${any.name}")
        is Customer -> println("Customer is ${any.name}, age is ${any.age} and type is ${any.type}")
        else -> println(any)
    }
}

fun printString(any: Any){
    val value = any as String
    println(value)
}

fun main() {
   printObject("luthfi")
   printObject(Customer("Luthfi", 22, "Regular"))
   printObject(Laptop("Macbook"))

    konversi("Alex")
    konversi(Customer("Alex", 22, "Premium"),)
    konversi(Laptop("Asus"))

    printString("Adilal")
//    printString(4)
}