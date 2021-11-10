package com.tordevs.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {//clase herencia :
    override fun onCreate(savedInstanceState: Bundle?) {//metodo
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)//configureme el contenido de la vista(numero hexadecimal R es de reosurce layput backage activity_main)
    }
}
//config develop
