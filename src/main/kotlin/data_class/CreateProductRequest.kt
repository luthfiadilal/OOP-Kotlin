package data_class

import annoations.NotBlank

data class CreateProductRequest(
    @NotBlank val id: String,
    @NotBlank val name: String,
    @NotBlank val price: Int
) {

}

data class CreateCategory(
    @NotBlank val id: String,
    @NotBlank val name: String
)