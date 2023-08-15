package data_class

class Motor(var brand: String,
            var model: String,
            var year: Int) {

    fun buy(brand: String): String {
        return "Selmat anda sudah membeli motor $brand dengan detail motor yaitu ${this.brand} ${this.model} ${this.year}"
    }
}