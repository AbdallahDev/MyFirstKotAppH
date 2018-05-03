package com.example.abdallahsarayrah.myfirstkotapph

import android.R
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun welcome(v:View){
        textView.text == "Welcome"
    }
}