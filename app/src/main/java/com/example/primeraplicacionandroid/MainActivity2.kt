package com.example.primeraplicacionandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.RadioButton
import android.widget.Spinner
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btnCmabiar2 = findViewById<Button>(R.id.btnCambiar2)
        val radio1 = findViewById<RadioButton>(R.id.rdButton1)
        val radio2 = findViewById<RadioButton>(R.id.rdButton2)
        val btn1 = findViewById<Button>(R.id.btnResta)
        val spinner = findViewById<Spinner>(R.id.spinner)
        val btnSpinner = findViewById<Button>(R.id.btnSpinner)

        val opciones = arrayListOf<String>("Karen","Luis","Felipe","Vanesa")

        val adaptador = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, opciones)

        spinner.adapter = adaptador

        btnSpinner.setOnClickListener{
            when(spinner.selectedItem.toString()){
                "Karen" -> Toast.makeText(this, "¡¡¡", Toast.LENGTH_LONG).show()
                "Luis" -> Toast.makeText(this, "---", Toast.LENGTH_LONG).show()
                "Felipe" -> Toast.makeText(this, "(._.)", Toast.LENGTH_LONG).show()
                "Vanesa" -> Toast.makeText(this, "...", Toast.LENGTH_LONG).show()
            }
        }

        btnCmabiar2.setOnClickListener{
            cambiar()
            finish()
        }

        btn1.setOnClickListener{
            if (radio1.isChecked){
                Toast.makeText(this, "presiono radio 1",Toast.LENGTH_LONG).show()
            }else if (radio2.isChecked){
                Toast.makeText(this, "presiono radio 2",Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this, "(._. ) ( ._.)",Toast.LENGTH_LONG).show()
            }
        }

    }
    fun cambiar(){
        val intent = Intent(this,MainActivity3::class.java)
        startActivity(intent)
    }



}