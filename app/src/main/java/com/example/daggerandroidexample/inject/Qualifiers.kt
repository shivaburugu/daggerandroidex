package com.example.daggerandroidexample.inject

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class DevKey


@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class ProdKey