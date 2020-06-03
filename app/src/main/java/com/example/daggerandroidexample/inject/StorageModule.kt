package com.example.daggerandroidexample.inject

import android.app.Application
import android.content.Context
import com.example.daggerandroidexample.MainApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class StorageModule {

    @Provides
    fun provideApplication(application: MainApplication): Application = application

    @Provides
    fun provideApplicationContext(application: MainApplication): Context = application

    @Singleton
    @Provides
    fun provideSharedPreference(applicationContext: Context) =
         applicationContext.getSharedPreferences("Test",Context.MODE_PRIVATE)

}