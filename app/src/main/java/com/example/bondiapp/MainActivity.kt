package com.example.bondiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Se declara el usuario y contraseña previamente definidos
        val cliente = Usuario("Roberto", "0000")

        //creo una lista con los futuros y actual cliente
        val listaPersonas = listOf(cliente)

        //Declaro las variables con su respectivo atributo
        val Usuario= findViewById<EditText>(R.id.ediUsuario)
        val Contraseña= findViewById<EditText>(R.id.ediContraseña)
        val btnLogin= findViewById<Button>(R.id.btnIngreso)

        var validar = false

        fun Revision (Usuario: Usuario): Boolean{// funcion para chequear y verificar el login
            var alerta = ""

            //verifico que los campos esten completos y de no ser asi se muestra un error
            if (Usuario.user == "" || Usuario.password == "") {
                alerta = "!Verificar los Campos!"
            }
            //verifico que los campos coincidan con el obj usuario
            else {
                listaPersonas.forEach {
                    if (Usuario.user != it.user) {
                        alerta = "Por Favor revisar el usuario."
                    }
                    //se verifica la contraseña
                    else {
                        if (Usuario.password != it.password) {
                            alerta = "Verifica la Contraseña Ingresada."
                        }
                        else {
                            validar = true
                        }
                    }
                }
            }
            //Si  falso  el boolean notifica el problema
            if (!validar)
            {
                Toast.makeText(this, alerta, Toast.LENGTH_SHORT).show()
            }
            return validar
        }

        btnLogin.setOnClickListener{
            //Se crea un objeto de tipo Usuario con los datos validados
            var Cliente = Usuario.text.toString()
            var contraseña= Contraseña.text.toString()
            val Logeo = Usuario(Cliente,contraseña)
            val valides = Revision(Logeo)

            if (valides)
            {
                val main: Bundle = Bundle()
                main.putString("ingreso", Logeo.user)

                val intent = Intent(this, MainActivity2:: class.java)
                intent.putExtras(main)
                startActivity(intent)
            }
        }
    }
}
