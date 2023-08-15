package data_class

class Television {
    lateinit var brand: String

    fun initTelevision(nameBrand : String){
        this.brand = nameBrand
    }

    /*
    di fungdi getNameBrand ini kita tidak perlu menginisialisasi brand
    disini kita mau menampilkan nama brand yang sudah di initialisasi di fungsi initTelevision
     */
    fun getNameBrand(): String {
        return "My brand is $brand"
    }

}