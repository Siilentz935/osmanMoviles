package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class sumaNumeros : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_suma_numeros)
        var numSum1: EditText = findViewById(R.id.numSum1)
        var numSum2: EditText = findViewById(R.id.numSum2)
        var txtView: TextView = findViewById(R.id.txtView)
        val sumar: Button = findViewById(R.id.sumar)
        sumar.setOnClickListener{
            var sumTotal=numSum1.text.toString().toInt()+numSum2.text.toString().toInt()
            txtView.setText("Mi toast cort $sumTotal")
        }
    }
}