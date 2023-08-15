package app

import data_class.Television

fun main() {
    val tv = Television()
    tv.initTelevision("Samsung")
    println(tv.getNameBrand())

}