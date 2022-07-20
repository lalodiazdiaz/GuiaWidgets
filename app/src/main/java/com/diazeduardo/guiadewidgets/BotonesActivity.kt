package com.diazeduardo.guiadewidgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class BotonesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_botones)
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