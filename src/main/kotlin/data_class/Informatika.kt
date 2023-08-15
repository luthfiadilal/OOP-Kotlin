package data_class

class Informatika(val semester: Int, name: String, age: Int): Student() {
    override val name: String = name
    override val age: Int = age
    override fun getFullName() {
        println("Hallo my name is $name and $age years old, I semester $semester mow")
    }

}