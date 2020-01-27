package com.example.clothesstoreapp.di

import com.example.clothesstoreapp.ClothesApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ClothesModule(val app: ClothesApplication) {@Provides
@Singleton
fun provideApp() = app
}