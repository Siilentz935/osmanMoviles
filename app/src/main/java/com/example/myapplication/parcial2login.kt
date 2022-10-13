package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.airbnb.lottie.parser.IntegerParser

class parcial2login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parcial2login)
        var login1 : EditText = findViewById(R.id.login1)
        var login2 : EditText = findViewById(R.id.login2)
        var btnleer : Button = findViewById(R.id.aceptar)

            btnleer.setOnClickListener{
                if (login2.text.toString()=="1" && login1.text.toString()=="segundoparcial"){
                var intent4 = Intent(this, Parcial2::class.java).apply {
                }
                startActivity(intent4)
            }
                else
                {
                    Toast.makeText(this,"Usuario y/o contraseña incorrectos", Toast.LENGTH_LONG).show()
                }
        }
    }
}