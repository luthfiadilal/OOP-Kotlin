package app

import data_class.Note

fun main() {
    val note = Note("belajar Kotlin")

    println(note.title)

    note.title = "Belajar Getter dan Setter"

    println(note.title)

    note.bigTitle

    println(note.bigTitle)
}