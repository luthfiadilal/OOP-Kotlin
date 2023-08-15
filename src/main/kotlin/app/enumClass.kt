package app

import data_class.Gender

fun main() {
    val man = Gender.Male
    val woman = Gender.Female
    val all: Array<Gender> = Gender.values()

    val manFromString = Gender.valueOf("Male")
    val womanFromString = Gender.valueOf("Female")

    println(man)
    println(woman)
    println(all.toList())
    println(manFromString)
    println(womanFromString)

    man.printDescription()
    woman.printDescription()
}