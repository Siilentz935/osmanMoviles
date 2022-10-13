package com.example.myapplication

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.constraintlayout.widget.ConstraintLayout

class PrimerParcial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_primerparcial)
        var numManzana: EditText = findViewById(R.id.numManzana)
        var numManzana2: EditText = findViewById(R.id.numManzana2)
        var btnManzana: ImageButton = findViewById(R.id.btnManzana)
        var btnManzana2: ImageButton = findViewById(R.id.btnManzana2)
        var button5: Button = findViewById(R.id.button5)
        var button15: Button = findViewById(R.id.button15)
        var button30: Button = findViewById(R.id.button30)
        var button50: Button = findViewById(R.id.button50)
        var calcular: Button = findViewById(R.id.Calcular)
        var textview3: TextView = findViewById(R.id.textView3)

        btnManzana.setOnClickListener{
           var numero1= (numManzana.text.toString().toInt())*(80)
            Toast.makeText(this,"Las Produccion Total es $numero1", Toast.LENGTH_LONG).show()
        }
        btnManzana2.setOnClickListener{
            var numero= (numManzana2.text.toString().toInt())*(80)
            Toast.makeText(this,"Las Produccion Actual es $numero", Toast.LENGTH_SHORT).show()
        }
        button5.setOnClickListener {
        var num=(numManzana2.text.toString().toInt())+(5)
            numManzana2.setText("$num")
        }
        button15.setOnClickListener {
            var num=(numManzana2.text.toString().toInt())+(15)
            numManzana2.setText("$num")
        }
        button30.setOnClickListener {
            var num=(numManzana2.text.toString().toInt())+(30)
            numManzana2.setText("$num")
        }
        button50.setOnClickListener {
            var num=(numManzana2.text.toString().toInt())+(50)
            numManzana2.setText("$num")
        }
        calcular.setOnClickListener {
            var numero1= (numManzana.text.toString().toInt())
            var sumTotal= ((numManzana2.text.toString().toInt())*100)/numero1
            textview3.setText("$sumTotal%")
            if(sumTotal>=70){
                var Const: ConstraintLayout= findViewById(R.id.alerta)
                Const.setBackgroundColor(Color.RED)
            }
            }

    }
}