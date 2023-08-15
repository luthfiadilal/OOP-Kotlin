package app

import data_class.ExecutifCustomer
import data_class.PremiumCustomer

fun main() {
    val premiumCustomer = PremiumCustomer("Luthfi", 22)
    println(premiumCustomer.name)
    println(premiumCustomer.age)
    println(premiumCustomer.type)

    val executiveCustomer = ExecutifCustomer("Adilal", 20)
    println(executiveCustomer.name)
    println(executiveCustomer.age)
    println(executiveCustomer.type)
}