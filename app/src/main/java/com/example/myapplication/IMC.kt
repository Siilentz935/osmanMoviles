package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class IMC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc)

        var num1: EditText = findViewById(R.id.num1)
        var num2: EditText = findViewById(R.id.num2)
        var txtView: TextView = findViewById(R.id.txtView2)
        var txtView2: TextView = findViewById(R.id.txtView3)
        var estatusDelPaciente = "El paciente se encuentra en el peso adecuado"
        val imc: Button = findViewById(R.id.imc)

        imc.setOnClickListener{
            if (num1.text.toString().isNotEmpty() && num2.text.toString().isNotEmpty()){
            var IMC=num1.text.toString().toFloat()/(num2.text.toString().toFloat()*num2.text.toString().toFloat())
            txtView.setText("El indice de masa corporal es de $IMC")
            if (IMC>19 && IMC<24.9){
                txtView2.setText(estatusDelPaciente)
            }
            else{
                estatusDelPaciente = "El paciente NO se encuentra en el peso adecuado"
                txtView2.setText("Mi toast cort $estatusDelPaciente")
            }
        }
            else{
                Toast.makeText(this,"Ingrese valores", Toast.LENGTH_LONG).show()
            }

        }

    }
}