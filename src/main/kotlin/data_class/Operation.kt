package data_class

sealed class Operation(val name: String)

class Add : Operation("plus")
class Minus : Operation("minus")


