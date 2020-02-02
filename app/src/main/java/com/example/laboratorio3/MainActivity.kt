package com.example.laboratorio3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.laboratorio3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    }

    // Cambiando el contenido del texto y luego haciendo visibles/
    fun changeText(view: View){
        binding.newContent.text = binding.changeName.text

        //Cambiando la visibilidad
        if(binding.nameView.visibility == 0){
            binding.nameView.visibility = View.GONE
            binding.changeName.visibility = View.GONE
            binding.newContent.visibility = View.VISIBLE
        } else {
            binding.nameView.visibility = View.VISIBLE
            binding.changeName.visibility = View.VISIBLE
            binding.newContent.visibility = View.GONE
        }
    }

    // Empezando la actividad
    fun changeActivity(view: View){
        startActivity(Intent(this, SecondActivity::class.java))
    }


}
