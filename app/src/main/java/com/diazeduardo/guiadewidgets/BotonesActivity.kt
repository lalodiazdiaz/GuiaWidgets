package com.diazeduardo.guiadewidgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.diazeduardo.guiadewidgets.databinding.ActivityBotonesBinding
import com.diazeduardo.guiadewidgets.databinding.ActivityMainBinding

class BotonesActivity : AppCompatActivity() {
    lateinit var binding : ActivityBotonesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityBotonesBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun mostrarSaludo(view: View) {
        var tag = view.tag
        var mensaje =""
        when(tag){
            "saludar"-> {
                mensaje =  "Que onda perrillo"
            }
            "email"->{
                mensaje =" Me vas  amandar un mail puto"
            }
        }

        Toast.makeText(applicationContext,mensaje,Toast.LENGTH_LONG).show()
    }
}