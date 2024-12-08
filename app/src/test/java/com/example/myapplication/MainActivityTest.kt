package com.example.myapplication

import org.junit.jupiter.api.Assertions.*


import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class MainActivityTest {
    private val activity = MainActivity()

    @Test
    fun obtenerListadoProductos() {
        val productos = listOf(
            Product(
                id = 1,
                name = "Producto A",
                description = "This is a sample product.",
                price = 10.99,
                currency = "USD",
                in_stock = true
            ),
            Product(
                id = 2,
                name = "Producto B",
                description = "This is another sample product.",
                price = 25.50,
                currency = "EUR",
                in_stock = false
            )
        )
        val resultado = activity.obtenerListadoProductos(productos)

        assertEquals(
            """
            ID: 1, Nombre: Product A
            ID: 2, Nombre: Product B
            """.trimIndent(),
            resultado
        )
    }

    @Test
    fun setProductService() {
    }
}