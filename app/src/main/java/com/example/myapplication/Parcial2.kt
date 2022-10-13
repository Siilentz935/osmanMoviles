package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class Parcial2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_parcial2)
        super.onCreate(savedInstanceState)
        var btnImg :Button= findViewById(R.id.btnacerca)
        val dialogView = layoutInflater.inflate(R.layout.activity_parcial2_dialog, null)
        val mBuilder = AlertDialog.Builder(this).setView(dialogView).setTitle("").create()
        var btnn : Button = dialogView.findViewById(R.id.button10)
        btnn.setOnClickListener {
            val browserIntent =
                Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/Siilentz935/Siilentz935.github.io"))
            startActivity(browserIntent)
        }
        btnImg.setOnClickListener {

          mBuilder.show()
        }

        var btnleer: Button= findViewById(R.id.btnqr)
        var btn: Button = dialogView.findViewById(R.id.button9)
        btn.setOnClickListener{
            mBuilder.dismiss()
        }
        btnleer.setOnClickListener{
            var intent4 = Intent(this, Parcial2Qr::class.java).apply {
            }
            startActivity(intent4)
        }
    }
}