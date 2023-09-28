package com.example.primeraplicacionandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

    }

    override fun onBackPressed() {
        super.onBackPressed()
        /*
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)

         */

        startActivity(Intent(this, MainActivity::class.java))
    }


}