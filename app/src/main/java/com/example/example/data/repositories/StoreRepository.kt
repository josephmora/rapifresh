package com.example.example.data.repositories

import com.example.example.data.mocks.StoreInfoMock
import com.example.example.data.models.StoreInfo


class StoreRepository(private val dataSource: StoreInfoMock) {
    suspend fun loadInfo():StoreInfo{
        return dataSource.loadInfo()
    }
}