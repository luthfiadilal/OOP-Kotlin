package data_class

class Car {
    var brand: String = ""
    var model: String = ""
    var year: Int = 2022

    constructor(pamaBrand: String, paramModel: String, paramYear: Int) {
        brand = pamaBrand
        model = paramModel
        year = paramYear

        println("constructor satu")
    }

    constructor(paramBrand: String, paramModel: String)
            : this(paramBrand, paramModel, paramYear = 2022) {
                println("constructor dua")
            }


}