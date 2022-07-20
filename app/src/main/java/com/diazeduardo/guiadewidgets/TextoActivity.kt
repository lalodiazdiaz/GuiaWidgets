package com.diazeduardo.guiadewidgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_texto.*


class TextoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_texto)

        btnMostrarDatos.setOnClickListener {
            var nombre = txtNombre.text.toString()
            var edad = txtEdad.text.toString()
            Toast.makeText(applicationContext, "Que onda $nombre, con que tienes $edad años ",Toast.LENGTH_LONG).show()

        }
    }
}