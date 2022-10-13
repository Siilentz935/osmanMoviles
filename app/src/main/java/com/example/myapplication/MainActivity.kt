package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnHellow: Button = findViewById(R.id.button)
        val btnHellow2: Button = findViewById(R.id.visible)
        val btnHellow3: Button = findViewById(R.id.button3)
        val btnHellow4: Button = findViewById(R.id.btnSuma)
        val btnHellow5: Button = findViewById(R.id.btnIMC)
        val btnHellow6: Button = findViewById(R.id.lottie)
        val btnHellow7: Button = findViewById(R.id.prs)
        val btnHellow8: Button = findViewById(R.id.button2)
        val btnHellow9: Button = findViewById(R.id.btnPokemon)
        val btnHellow10: Button = findViewById(R.id.button4)
        val btnHellow11: Button = findViewById(R.id.button6)
        val imageBasketBall: ImageView = findViewById(R.id.imageView2)
        btnHellow.setOnClickListener{
            imageBasketBall.isVisible = false
        }
        btnHellow2.setOnClickListener{
            imageBasketBall.isVisible = true
        }
        btnHellow3.setOnClickListener{
            var intent1 = Intent(this, ToastActivity::class.java).apply {
            }
            startActivity(intent1)
        }
        btnHellow4.setOnClickListener{
            var intent2 = Intent(this, sumaNumeros::class.java).apply {
            }
            startActivity(intent2)
        }
        btnHellow5.setOnClickListener{
            var intent3 = Intent(this, IMC::class.java).apply {
            }
            startActivity(intent3)
        }
        btnHellow6.setOnClickListener{
            var intent3 = Intent(this, Animacination::class.java).apply {
            }
            startActivity(intent3)
        }
        btnHellow7.setOnClickListener{
            var intent4 = Intent(this, PaperRockScisor::class.java).apply {
            }
            startActivity(intent4)
        }
        btnHellow8.setOnClickListener{
            var intent4 = Intent(this, Preguntas::class.java).apply {
            }
            startActivity(intent4)
        }
        btnHellow9.setOnClickListener{
            var intent4 = Intent(this, Pokemon::class.java).apply {
            }
            startActivity(intent4)
        }
        btnHellow10.setOnClickListener{
            var intent4 = Intent(this, ReadQrCode::class.java).apply {
            }
            startActivity(intent4)
        }
        btnHellow11.setOnClickListener{
            var intent4 = Intent(this, Dialog::class.java).apply {
            }
            startActivity(intent4)
        }
    }
}