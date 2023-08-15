package data_class

class Rectangle : Shape(){
    override val corner: Int = 5
    val parentCorner: Int = super.corner

    override fun printName(corner: Int) {
        println("This is rectangle $corner")
        super.printName(corner)
    }


}