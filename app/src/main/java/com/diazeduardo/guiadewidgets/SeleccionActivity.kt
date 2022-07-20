package com.diazeduardo.guiadewidgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.Switch
import android.widget.Toast

class SeleccionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seleccion)
    }

    fun ValidaSeleccion(view: View) {
    if (view is CheckBox){
        if (view.isChecked){
            Toast.makeText(applicationContext,"Seleccionado",Toast.LENGTH_LONG).show()
        }
        else{
            Toast.makeText(applicationContext,"No seleccionado",Toast.LENGTH_LONG).show()
        }
    }
        else if(view is Switch){
            if (view.isChecked){
                Toast.makeText(applicationContext,"Permitido",Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(applicationContext,"Denegado",Toast.LENGTH_LONG).show()
            }
    }
        else if (view is RadioButton){
            when(view.id){
                R.id.rb1->{
                    Toast.makeText(applicationContext,"Radio  uno seleccionado",Toast.LENGTH_LONG).show()
                }
                R.id.rb2->{
                    Toast.makeText(applicationContext,"Radio dos seleccionado",Toast.LENGTH_LONG).show()
                }

            }
    }
    }
}