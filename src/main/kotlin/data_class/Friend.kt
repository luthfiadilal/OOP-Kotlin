package data_class

data class Friend(val name: String) {

}

fun sayHello(friend: Friend?){
    if (friend != null){
        println("Hello ${friend.name}")
    }
}

fun greeting(friend: Friend?){
    val name = friend?.name ?: ""
    println("Good morning $name")
}

fun helo(frend: Friend?){
    val name = frend!!.name
    println("Hello $name")
}


fun main() {
    sayHello(Friend("Luthfi"))
    sayHello(null)

    greeting(Friend("Alex"))
    greeting(null)

    helo(Friend("Adilal"))
    helo(null)
}