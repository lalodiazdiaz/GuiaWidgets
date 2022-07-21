package com.diazeduardo.guiadewidgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.diazeduardo.guiadewidgets.databinding.ActivityTextoBinding


class TextoActivity : AppCompatActivity() {
    lateinit var binding: ActivityTextoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityTextoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMostrarDatos.setOnClickListener {
            var nombre = binding.txtNombre.text.toString()
            var edad = binding.txtEdad.text.toString()
            Toast.makeText(applicationContext, "Que onda $nombre, con que tienes $edad años ",Toast.LENGTH_LONG).show()

        }
    }
}