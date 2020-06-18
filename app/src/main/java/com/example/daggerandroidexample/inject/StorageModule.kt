package com.example.daggerandroidexample.inject

import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext

@Module
@InstallIn(ApplicationComponent::class)
class StorageModule {

    @Provides
    fun provideSharedPreference(@ApplicationContext applicationContext: Context): SharedPreferences =
         applicationContext.getSharedPreferences("Test",Context.MODE_PRIVATE)

    @DevKey
    @Provides
    fun provideDevKey() : String = "Development Key"

    @ProdKey
    @Provides
    fun provideProdKey() : String = "Prod Key"

}