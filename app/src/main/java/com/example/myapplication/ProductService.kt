package com.example.myapplication

import retrofit2.Call
import retrofit2.http.GET

interface ProductService {


    @GET("b/MX0A")
    fun getProducts(): Call<ProductResponse>
}