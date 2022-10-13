package com.example.myapplication

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import com.airbnb.lottie.LottieAnimationView

class PaperRockScisor : AppCompatActivity() {
    private var mSensorManager : SensorManager? = null
    private var mSensorListener : ShakeEventListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paper_rock_scisor)
         mSensorManager = getSystemService(SENSOR_SERVICE) as SensorManager?
        mSensorListener = ShakeEventListener()
        val btnInit : Button = findViewById(R.id.btnInitRock);
        val imgView : ImageView = findViewById(R.id.imageView3)
        mSensorListener!!.setOnShakeListener {
            var rdn= (1..3).random();
        Log.d("mensaje","el numero es ${rdn}");
            when(rdn){
                1->imgView.setImageResource(R.drawable.rock)
                2->imgView.setImageResource(R.drawable.paper)
                3->imgView.setImageResource(R.drawable.scissor)
            }

    }

    }
    override fun onResume(){
    super.onResume()
        mSensorManager!!.registerListener(
            mSensorListener,
            mSensorManager!!.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
        SensorManager.SENSOR_DELAY_UI
        )
    }

    override fun onPause() {

            mSensorManager!!.unregisterListener(mSensorListener)
            super.onPause()

    }
}