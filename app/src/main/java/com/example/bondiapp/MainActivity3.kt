package com.example.bondiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var botonIngreso: Button = findViewById(R.id.btnAgregar)
        var linea: EditText = findViewById(R.id.txtLinea)
        var color: EditText = findViewById(R.id.txtColor)
        var aire: EditText = findViewById(R.id.txtAire)
        var cartel: EditText = findViewById(R.id.txtCartelera)

        botonIngreso.setOnClickListener {
            guardarColectivo(linea, color, aire, cartel)
        }
    }

    fun guardarColectivo(linea: EditText, color: EditText, aire: EditText, cartel: EditText) {
        var guardoLinea = linea.text.toString()
        var guardoColor = color.text.toString()
        var guardoAire = aire.text.toString()
        var guardoCartel = cartel.text.toString()

        var Garage1 = Colectivo(guardoLinea, guardoColor, guardoAire, guardoCartel)

        Toast.makeText(this, "¡¡  Fue Cargada Satisfactoriamente!!", Toast.LENGTH_LONG).show()

        if (guardoLinea.isEmpty() || guardoColor.isEmpty() || guardoAire.isEmpty() || guardoCartel.isEmpty()) {
            Toast.makeText(this, "FALTAN COMPLETAR CAMPOS!!.", Toast.LENGTH_SHORT).show()
        } else {

            val intent = Intent(this, MainActivity4::class.java)



            intent.putExtra("bus", Garage1)
            startActivity(intent)
            finish()
        }
    }
}
