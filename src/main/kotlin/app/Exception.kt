package app

import Exception.ValidationException
import java.lang.NullPointerException

fun validateHello(name : String) {
    if (name.isBlank()){
        throw ValidationException("Name cannot be blank")
    } else {
        println("Hello $name")
    }
}

fun main() {
    try {
        validateHello("Luthfi")
        println("Program")
        validateHello("")
    } catch (error : ValidationException){
        println("Terjadi error ${error.message}")
    } catch (error: NullPointerException){
        println("Terjadi error ${error.message}")
    } finally {
        println("Finally will always be executed")
    }

}