package data_class

enum class Gender(val description: String) {
    Male("Male"), Female("Female");

    fun printDescription(){
        println(description)
    }
}