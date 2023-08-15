package data_class

open class Shape(open val corner: Int = 2) {

    open fun printName(corner: Int){
        println("This is shape $corner")
    }

}