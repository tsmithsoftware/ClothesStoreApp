package com.example.clothesstoreapp.di

import com.example.clothesstoreapp.ClothesApplication
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ClothesModule::class])
interface ClothesComponent {
    fun inject(app:ClothesApplication)

    @Component.Builder
    interface Builder {
        fun build() : ClothesComponent
        fun birdModule(birdModule: ClothesModule): Builder
    }
}