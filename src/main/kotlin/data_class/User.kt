package data_class

class User(val name: String, val age: Int, ) {

    constructor(name: String): this(name, 20)


    override fun toString(): String {
        return "Hallo my name is $name and my age is $age"
    }

    override fun equals(other: Any?): Boolean {
        return when (other) {
            is User -> name == other.name && age == other.age
            else -> false
        }
    }

    override fun hashCode(): Int {
        return name.hashCode()
    }
}