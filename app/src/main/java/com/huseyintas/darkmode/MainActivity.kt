package com.huseyintas.darkmode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Normalmod.setOnClickListener{

            delegate.localNightMode = AppCompatDelegate.MODE_NIGHT_NO
        }

        karanlıkmod.setOnClickListener{
            delegate.localNightMode = AppCompatDelegate.MODE_NIGHT_YES
        }



    }
}