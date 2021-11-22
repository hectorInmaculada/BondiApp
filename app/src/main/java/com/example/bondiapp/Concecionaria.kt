package com.example.bondiapp

abstract  class Concecionaria(var chasis:String="", var motor:Int=0) {
        abstract  fun Logueo()
        abstract  fun fabrica():String
}