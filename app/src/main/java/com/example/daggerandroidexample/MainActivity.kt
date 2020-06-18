package com.example.daggerandroidexample

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.daggerandroidexample.inject.DevKey
import com.example.daggerandroidexample.inject.ProdKey
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var sharedPreferences: SharedPreferences

    @DevKey
    @Inject
    lateinit var devKey: String

    @ProdKey
    @Inject
    lateinit var prodKey: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if(this::sharedPreferences.isInitialized){
            Log.d("Test","shared preference is initialized")
        } else {
            Log.d("Test","shared preference is not initialized")

        }

        Log.d("Test","Dev key value is $devKey")
        Log.d("Test","Dev key value is $prodKey")


    }

}
