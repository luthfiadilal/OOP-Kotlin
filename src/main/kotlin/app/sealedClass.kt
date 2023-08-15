package app

import data_class.Add
import data_class.Minus
import data_class.Operation

fun operation(value1: Int, value2: Int, operation: Operation): Int {
    return when(operation){
        is Add -> value1 + value2
        is Minus -> value1 - value2
    }

}



fun main() {
    println(operation(1, 2, Add()))
    println(operation(1, 2, Minus()))
}