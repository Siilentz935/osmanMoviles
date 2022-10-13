package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ToastActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toast)
        val btnShortDuration: Button = findViewById(R.id.btnShortDuration)
        btnShortDuration.setOnClickListener{
            Toast.makeText(this,"Mi toast cort", Toast.LENGTH_SHORT).show()
        }
        val name = "Osman"
        val btnLongDuration: Button = findViewById(R.id.btnLongDuration)
        btnLongDuration.setOnClickListener{
            Toast.makeText(this,"Mi toast de $name", Toast.LENGTH_LONG).show()
        }
    }
}