package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class Dialog : AppCompatActivity() {
    lateinit var btnShow: Button
    lateinit var btnCancellLoginDialog : Button
    lateinit var btnLoginDialog : Button
    lateinit var txtDialogName: EditText
    lateinit var txtDialogEmail: EditText
    lateinit var txtDialogPassword: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialog)
         btnShow = findViewById(R.id.btnDialog)
        var btnImg :Button= findViewById(R.id.btnDialogImg)
        btnShow.setOnClickListener {  }
        btnImg.setOnClickListener {
            val dialogView = layoutInflater.inflate(R.layout.dialog_image, null)
            val nmBuilder = AlertDialog.Builder(this).setView(dialogView).setTitle("Image dialog").show()
        }
    }
}