package com.example.myapplication

class ProductFormatter {

    fun formatProducts(products: List<Product>?): String {
        if (products.isNullOrEmpty()) {
            return "No hay productos disponibles"
        }
        return products.joinToString("\n") { product ->
            "Producto: ${product.name} precio: ${product.price}"
        }
    }
}