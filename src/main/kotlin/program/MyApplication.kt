package program

import annoations.Fancy

@Fancy(author = "Luthfi")
class MyApplication(val name: String, val version: Int) {

    fun info(): String = "Application $name-$version"
}