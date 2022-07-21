package com.diazeduardo.guiadewidgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import com.diazeduardo.guiadewidgets.databinding.ActivityRegistroBinding

class RegistroActivity : AppCompatActivity() {
lateinit var binding: ActivityRegistroBinding
    var genero ="Hombre"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityRegistroBinding.inflate(layoutInflater)
        setContentView(binding.root)
            }

    fun RegistrarUsuario(view: View) {
        var email =  binding.email.text.toString()
        var pass = binding.pass.text.toString()

        if (binding.hombre.isChecked){
            genero="Hombre"
          }
        else
        {
            genero="Mujer"
        }

var registro = "Correo: $email  \nContraseña: $pass \nGenero : $genero "

            Toast.makeText(applicationContext,registro,Toast.LENGTH_LONG).show()
    }
}