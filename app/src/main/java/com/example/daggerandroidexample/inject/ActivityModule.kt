package com.example.daggerandroidexample.inject

import com.example.daggerandroidexample.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector
    internal abstract  fun contributeProductListActivity(): MainActivity
}