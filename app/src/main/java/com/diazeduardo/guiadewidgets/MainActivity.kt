package com.diazeduardo.guiadewidgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnTexto.setOnClickListener{
            Log.d("Mensaje","fuck you")
        }

        btnBotones.setOnClickListener {
            Log.d("Mensaje","mama huevo")
        }
        btnSeleccion.setOnClickListener {
            Log.d("Mensaje","chupa pinga")

        }
    }
}