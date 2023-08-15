package app

import data_class.Action

fun fireAction(action: Action){
    action.action()
}


fun main() {
    fireAction(object : Action {
        override fun action() {
            println("Action pertama")
        }
    })
}