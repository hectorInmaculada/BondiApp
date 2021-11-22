package com.example.bondiapp

class DOTA(var sube:String, var aceite:String, var combustible:String):Concecionaria (chasis="",motor = 0){
    override fun Logueo() {
        println("-----------------------------------")
        println("-------Bienvenido a Carrocerias Todo Bus S.A-------")
        println(" Chasis Nº: ${this.chasis}")
        println(" La Cilindrada del Motor es de : ${this.motor}")
        println(" Utiliza el aceite: ${this.aceite}")
        println("-----------------------------------")
    }

    override fun fabrica(): String {
        return ("${this.chasis} es de fabricacion nacional!." )
    }
}