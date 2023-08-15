package data_class

class Person(firstNameparam: String
    , middleNameparam: String?, lastNameparam: String) {

    init {
        println("Objek $firstNameparam di buat")
    }

    constructor(firstNameparam: String, lastNameparam: String): this(firstNameparam, null, lastNameparam){
        println("Secondary constructor")
    }

    constructor(firstNameparam: String): this(firstNameparam, null, ""){
        println("Secondary constructor 2")
    }

    var firstName: String = firstNameparam
    var middleName: String? = middleNameparam
    var lastName: String = lastNameparam

    fun getFullName(): String {
        return "Hello $firstName $middleName $lastName apa kabar?"
    }

    fun sayHello(name: String): String {
        return "Hello $name, my name is $firstName"
    }

    fun sayHello(name: String, lastName: String): String {
        return "Hello $name $lastName, my name is $firstName "
    }


}