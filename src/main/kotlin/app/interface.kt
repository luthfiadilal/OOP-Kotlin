package app

import data_class.Human

fun main() {
    val human = Human("Luthfi")
    human.sayHello("Alex")
    human.getName()
    human.run()
    human.sleep()
    human.move()
}