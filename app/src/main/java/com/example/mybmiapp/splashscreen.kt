package com.example.mybmiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class splashscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        val splashScreen=Intent(this,MainActivity::class.java)


       Handler().postDelayed({
           startActivity(splashScreen)
           finish()
       },4000)



    }
}