package com.example.bondiapp

import android.os.Build
import android.os.Parcel
import android.os.Parcelable
import androidx.annotation.RequiresApi

data class Colectivo(var linea:String, var color:String,var aire:String, var cartel:String): Parcelable{
    companion object{
        @JvmField val CREATOR: Parcelable.Creator<Colectivo> = object : Parcelable.Creator<Colectivo>{
            override fun newArray(size: Int): Array<Colectivo?> = arrayOfNulls(size)

            @RequiresApi(Build.VERSION_CODES.Q)
            override fun createFromParcel(source: Parcel): Colectivo=Colectivo(source)
        }
    }
    @RequiresApi(Build.VERSION_CODES.Q)
    constructor(source: Parcel) : this
        (source.readString()!!,
        source.readString()!!,
        source.readString()!!,
        source.readString()!!)


    @RequiresApi(Build.VERSION_CODES.Q)
    override fun writeToParcel(dest: Parcel?, flags: Int) {
        dest?.let{
            dest.writeString(linea)
            dest.writeString(color)
            dest.writeString(aire)
            dest.writeString(cartel)
        }
    }

    override fun describeContents(): Int=0

}


