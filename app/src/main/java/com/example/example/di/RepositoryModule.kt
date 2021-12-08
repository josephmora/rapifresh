package com.example.example.di

import com.example.example.data.repositories.CommentRepository
import com.example.example.data.repositories.ProductRepository
import com.example.example.data.repositories.StoreRepository
import org.koin.dsl.module

val repoModule= module {
    single { StoreRepository(get()) }
    single { ProductRepository(get()) }
    single { CommentRepository(get()) }
}