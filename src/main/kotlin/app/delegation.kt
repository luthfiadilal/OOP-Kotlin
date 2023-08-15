package app

import data_class.Delegate
import data_class.MyBase

fun main() {
    val base = MyBase()
    base.gretting("Morning")

    val baseDelegate = Delegate(base)
    baseDelegate.gretting("night")
}