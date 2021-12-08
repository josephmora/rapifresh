package com.example.example.di

import com.example.example.ui.viewmodels.CommentViewModel
import com.example.example.ui.viewmodels.ProductViewModel
import com.example.example.ui.viewmodels.StoreViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { StoreViewModel(get()) }
    viewModel { CommentViewModel(get()) }
    viewModel { ProductViewModel(get()) }

}