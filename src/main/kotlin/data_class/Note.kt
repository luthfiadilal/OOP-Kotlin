package data_class

class Note(title: String) {
    var title: String = title
        get() {
            println("Getter di jalankan")
            return field
        }
        set(value) {
            if (value.isNotBlank()){
                field = value
            }
        }

    val bigTitle: String
        get() = title.uppercase()

}