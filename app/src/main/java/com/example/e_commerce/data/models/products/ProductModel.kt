package com.example.e_commerce.data.models.products

data class ProductModel(
    val id: Int,
    val name: String,
    val price: Double,
    val image: String,
    val description: String,
    val category: String
)