package app

import Exception.ValidationException
import annoations.NotBlank
import data_class.CreateProductRequest
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.memberProperties

fun validateRequest(request: Any){
    val clazz = request::class
    val properties = clazz.memberProperties

    for (property in properties){
        if (property.findAnnotation<NotBlank>() != null) {
            val value = property.call(request)
            when (value){
                is String -> {
                    if ("" == value){
                        throw ValidationException("${property.name} is blank")
                    }
                }
            }

        }
    }
}


fun main() {
    val reques = CreateProductRequest("1", "Kopi", 10000)
    validateRequest(reques)
}