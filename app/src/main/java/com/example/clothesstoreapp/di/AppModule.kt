package com.example.clothesstoreapp.di

import com.example.clothesstoreapp.ClothesApplication
import com.example.clothesstoreapp.fragments.ViewProductFragment
import com.example.clothesstoreapp.viewmodels.ViewProductViewModel
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(val app: ClothesApplication) {
    @Provides
    @Singleton
    fun provideApp() = app

    @Provides
    @Singleton
    fun provideBirdFancierViewModel() : ViewProductViewModel {
        return ViewProductViewModel()
    }

    @Provides
    fun provideBirdFancierFragment(): ViewProductFragment {
        return ViewProductFragment()
    }
}