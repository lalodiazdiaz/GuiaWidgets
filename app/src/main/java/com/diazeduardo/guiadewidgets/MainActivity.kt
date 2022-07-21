package com.diazeduardo.guiadewidgets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.diazeduardo.guiadewidgets.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTexto.setOnClickListener{
        var intent = Intent(applicationContext,TextoActivity::class.java)
            startActivity(intent)
        }

        binding.btnBotones.setOnClickListener {
            var intent = Intent(applicationContext,BotonesActivity::class.java)
            startActivity(intent)
        }
        binding.btnSeleccion.setOnClickListener {
            var intent = Intent(applicationContext,SeleccionActivity::class.java)
            startActivity(intent)
        }
        binding.btnRegistro.setOnClickListener {
            var intent = Intent(applicationContext,RegistroActivity::class.java)
            startActivity(intent)
        }
    }
}