package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ReadQrCode : AppCompatActivity() {
    private lateinit var txtQr: TextView
    private lateinit var txtQr2: TextView
    private lateinit var txtQr3: TextView
    private lateinit var txtQr4: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_read_qr_code)

        val qrValueCode = intent.getStringExtra("qrCodeValue")
        txtQr = findViewById(R.id.idQr)

        txtQr2 = findViewById(R.id.idQr2)
        txtQr3 = findViewById(R.id.idQr3)
        txtQr4 = findViewById(R.id.idQr4)
        var strin= qrValueCode
        val lista = strin.toString().split(",")
        if(lista.size==4){
        txtQr.text = "Marca:"+lista[0]
        txtQr2.text = "Modelo"+lista[1]
        txtQr3.text = "Año"+lista[2]
        txtQr4.text = "Deuda"+lista[3]
        }
    }
}