package com.example.examen2parh

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.examen2parh.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        iniciarSesion()
    }


    private fun iniciarSesion(){
        binding.btnInciarSesion.setOnClickListener {

            val contrasenia = "abc123"

            if (binding.etContrasenia.text.toString() != contrasenia) {
                Toast.makeText(this, "Contraseña incorrecta",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }else{
                val intent = Intent(this, ProfileActivity::class.java).apply{

                }
            }

            startActivity(intent)

        }
    }
}