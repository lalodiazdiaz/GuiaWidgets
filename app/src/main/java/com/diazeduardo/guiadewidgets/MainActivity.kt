package com.diazeduardo.guiadewidgets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnTexto.setOnClickListener{
        var intent = Intent(applicationContext,TextoActivity::class.java)
            startActivity(intent)
        }

        btnBotones.setOnClickListener {
            var intent = Intent(applicationContext,BotonesActivity::class.java)
            startActivity(intent)
        }
        btnSeleccion.setOnClickListener {
            var intent = Intent(applicationContext,SeleccionActivity::class.java)
            startActivity(intent)
        }
    }
}