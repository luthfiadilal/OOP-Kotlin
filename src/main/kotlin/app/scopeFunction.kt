package app

import data_class.Informatika
import data_class.Student

fun main() {
    val student = Informatika(5, "Luthfi", 22)

    student.let {
        println(it.semester)
        println(it.name)
        println(it.age)
    }

    val result = student.run {
        "Name is ${this.name} and age is ${this.age}"
    }


    val result2 = student.apply {
        "Name is ${this.name} and age is ${this.age}"
    }

    val result3 = student.also {
        "Name is ${it.name} and age is ${it.age}"
    }

    val result4 = with(student){
        "Name is ${this.name} and age is ${this.age}"
    }

    println(result)

    println(result2)

    println(result3)

    println(result4)
}