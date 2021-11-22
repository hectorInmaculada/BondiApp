package com.example.bondiapp

class Usuario {
    var user : String = ""   //declaracion de variables de tipo string que referencian al
    var password : String = ""   //usuario y cotraseña que luego van a ser llamados en el Login

    constructor(user :String, password: String){ // creacion del contructor que nos va a
        this.user = user
        this.password = password//pedir el usuario y contraseña
    }

}