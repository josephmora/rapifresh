package com.example.example.di

import com.example.example.data.mocks.CommentMock
import com.example.example.data.mocks.ProductMock
import com.example.example.data.mocks.StoreInfoMock
import org.koin.dsl.module

val dataSourceModule = module {

    single { CommentMock() }
    single { ProductMock() }
    single { StoreInfoMock()}

}