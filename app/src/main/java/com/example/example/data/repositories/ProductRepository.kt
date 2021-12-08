package com.example.example.data.repositories

import com.example.example.data.mocks.ProductMock
import com.example.example.data.models.Product


class ProductRepository(private val dataSource: ProductMock){
    suspend fun loadProducts(): List<Product> {
         return dataSource.loadProducts()
    }
}