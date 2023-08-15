package data_class

data class Fruit(val total: Int) {
    operator fun plus(fruit: Fruit): Fruit{
        return Fruit(total + fruit.total)
    }
}

