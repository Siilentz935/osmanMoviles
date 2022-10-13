package com.example.myapplication

import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.budiyev.android.codescanner.AutoFocusMode
import com.budiyev.android.codescanner.CodeScanner
import com.budiyev.android.codescanner.CodeScannerView
import com.budiyev.android.codescanner.DecodeCallback
import com.budiyev.android.codescanner.ErrorCallback
import com.budiyev.android.codescanner.ScanMode

class Camara : AppCompatActivity() {
    private lateinit var codeScanner: CodeScanner
    val My_Camera_Permission_Request = 1111
    private lateinit var scannerView: CodeScannerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camara)
        scannerView = findViewById(R.id.scan2)
        codeScanner = CodeScanner(this, scannerView)
        codeScanner.camera = CodeScanner.CAMERA_BACK
        codeScanner.formats = CodeScanner.ALL_FORMATS
        codeScanner.autoFocusMode = AutoFocusMode.SAFE
        codeScanner.scanMode = ScanMode.SINGLE
        codeScanner.isAutoFocusEnabled = true
        codeScanner.isFlashEnabled = false
        codeScanner.decodeCallback= DecodeCallback {
            runOnUiThread{
                Toast.makeText(this,"${it.text}",Toast.LENGTH_LONG).show()
                val intent = Intent(this, ReadQrCode::class.java)
                intent.putExtra("qrCodeValue", it.text)
                startActivity(intent)
                codeScanner.stopPreview()
            }
        }
        codeScanner.errorCallback = ErrorCallback {
            runOnUiThread {
                Toast.makeText(this,"${it.message}",Toast.LENGTH_LONG).show()
            }
        }
        codeScanner.startPreview()
        checkPermission()
    }
    fun checkPermission(){
    if(ContextCompat.checkSelfPermission(this,android.Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED){
    ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.CAMERA),My_Camera_Permission_Request)
    }else{
        codeScanner.startPreview()
        }
    }
}
