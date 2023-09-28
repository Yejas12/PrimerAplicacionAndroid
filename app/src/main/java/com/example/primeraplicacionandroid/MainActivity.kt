package com.example.primeraplicacionandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val btnSaludar = findViewById<Button>(R.id.btnSaludar)
        val btnSumar = findViewById<Button>(R.id.btnSumar)
        val btnCambiar = findViewById<Button>(R.id.btnCambiar)

        val numero1 = findViewById<TextView>(R.id.cmpNum1)
        val numero2 = findViewById<TextView>(R.id.cmpNum2)
        val cmpResultaado = findViewById<TextView>(R.id.cmpResultado)

        /*
        btnSaludar.setOnClickListener{
            Toast.makeText(this,"saludo Kotlin", Toast.LENGTH_LONG).show()
        }

         */

        btnSumar.setOnClickListener{
            val nu1 = numero1.text.toString().toInt()
            val nu2 = numero2.text.toString().toInt()
            cmpResultaado.setText(sumar(nu1,nu2).toString())
        }

        btnCambiar.setOnClickListener{
            cambiar()
            finish()
        }
    }
    fun cambiar(){

        val intent = Intent(this,MainActivity2::class.java)
        startActivity(intent)
    }

    fun sumar(num1:Int, num2:Int):Int{
        return num1+num2
    }
}