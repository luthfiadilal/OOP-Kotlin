package data_class

open class Customer(val name: String, val age: Int, val type: String) {
    constructor(name: String, age: Int) : this (name, age, "Regular")
    constructor(name: String) : this (name, 20)

    fun printCustomer(){
        println("Customer is ${name}, age is ${age} and type is ${type}")
    }

}

class PremiumCustomer : Customer {
    constructor(name: String) : super(name, 20, "Reguler")
    constructor(name: String, age: Int) : super(name, age, "Premium")
}

class ExecutifCustomer(name: String, age: Int) : Customer(name, age, "Executive"){
    constructor(name: String) : this (name, 21)


}