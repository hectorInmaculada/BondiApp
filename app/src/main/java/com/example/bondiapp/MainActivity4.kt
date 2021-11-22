package com.example.bondiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val arrayAdapter: ArrayAdapter<*>
        val listaBondi: ListView =findViewById(R.id.colecList)
        val list = ArrayList<String>()
        list.add("       Linea              Color           Aire        Cartel  ")
        list.add("       Linea 21           azul            Clima       Led     ")
        list.add("       Linea 9            azul            vmg         Tira led")
        list.add("       Linea 278          rojo            vmg         Led     ")



        arrayAdapter= ArrayAdapter(this,android.R.layout.simple_list_item_1,list)
        listaBondi.adapter=arrayAdapter

        list.add(traeBondi())



    }
    fun traeBondi():String{
        val colectivo=intent.getParcelableExtra<Colectivo>("bus")
        if (colectivo!=null){
            return "      ${colectivo.linea}          ${colectivo.color}        ${colectivo.aire}  ${colectivo.cartel}"

        }
        return ""
    }
}

