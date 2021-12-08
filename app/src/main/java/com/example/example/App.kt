package com.example.example

import android.app.Application
import com.example.example.di.dataSourceModule
import com.example.example.di.repoModule
import com.example.example.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App:Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(listOf(dataSourceModule, repoModule, viewModelModule))
        }
    }
}