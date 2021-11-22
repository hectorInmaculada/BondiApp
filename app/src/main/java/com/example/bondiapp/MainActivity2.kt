package com.example.bondiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val bundle=intent.extras
        val objeto=bundle?.getString("ingreso")
        var ingreso: TextView=findViewById(R.id.txtIngreso)
        val botonAgrega=findViewById<Button>(R.id.ingresoCole)
        val botonMuestra=findViewById<Button>(R.id.muestroCole)

        ingreso.text="Bienvenido ¡${objeto}!."

        botonAgrega.setOnClickListener {
            startActivity(Intent(this, MainActivity3:: class.java))
        }

        botonMuestra.setOnClickListener {
            startActivity(Intent(this, MainActivity5:: class.java))
        }


    }
}