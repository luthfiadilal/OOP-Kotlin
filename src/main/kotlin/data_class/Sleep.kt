package data_class

interface Sleep: Interaction {
    fun sleep(){
        println("${this.name} is sleeping")
    }



}