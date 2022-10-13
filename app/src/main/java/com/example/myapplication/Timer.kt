package com.example.myapplication

import android.content.IntentSender
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView

class Timer : AppCompatActivity() {
    internal lateinit var  btnTap: Button
    internal lateinit var  count: TextView
    internal lateinit var  time: TextView
    var score: Int = 0
    lateinit var countDownTimer : CountDownTimer
    var initialCountDown : Long = 5000
    var countDownInterval : Long = 1000

    private var startMusic: MediaPlayer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        val bounce = AnimationUtils.loadAnimation(this,R.anim.bounce)
        val shake = AnimationUtils.loadAnimation(this,R.anim.shake)
        initTimer()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_timer)
        btnTap = findViewById(R.id.btnTimer)
        count = findViewById(R.id.contador)
        time = findViewById(R.id.timer)
        count.text = getString(R.string.score,score.toString())
        btnTap.setOnClickListener{
            it.startAnimation(bounce)
            count.startAnimation(shake)
            if(score === 0) {
                startMusic = MediaPlayer.create(this, R.raw.audio)
                startMusic?.start()
                countDownTimer.start()
            }
            incremento()
        }
    }
    private fun incremento(){
        score ++
        val newscore: String = getString(R.string.score,score.toString())
        count.text = newscore
    }
    private fun initTimer(){
        countDownTimer = object: CountDownTimer(initialCountDown,countDownInterval){
            override fun onTick(millisUntilFinished: Long) {
                    val timeleft : Long = millisUntilFinished/1000
                time.text = getString(R.string.time_left,timeleft.toString())
            }

            override fun onFinish() {
                btnTap.isEnabled=false
               Log.d("Endgame","endGame")
            }
        }
    }
}