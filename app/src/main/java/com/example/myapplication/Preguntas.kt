package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class Preguntas : AppCompatActivity() {
    private lateinit var trueButton: Button
    private lateinit var falseButton: Button
    private lateinit var nextButton: Button
    private lateinit var questionTextView: TextView
    private val questionBank = listOf(
        question(R.string.question_australia,true),
        question(R.string.question_oceans,true),
        question(R.string.question_mideast,false),
        question(R.string.question_africa,false),
        question(R.string.question_americas,true)
    )
    private var currentIndex=0
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preguntas)
        trueButton = findViewById(R.id.btnTrue)
        falseButton =findViewById(R.id.btnFalse)
        nextButton = findViewById(R.id.btnNext)
        questionTextView = findViewById(R.id.textView6)

        trueButton.setOnClickListener {
           checkAnswer(true)
        }
        falseButton.setOnClickListener {
            checkAnswer(false)
        }
        nextButton.setOnClickListener {
            currentIndex = (currentIndex + 1)%questionBank.size

            updateQuestion()
        }
        updateQuestion()
    }
    private fun updateQuestion(){
        val questionTextResId = questionBank[currentIndex].textResId
        questionTextView.setText(questionTextResId)
    }
    private fun checkAnswer(userAnswer: Boolean){
        val correctAnswer = questionBank[currentIndex].answer
        val messageResId = if (userAnswer == correctAnswer){
            R.string.correct_toast
        }else{
            R.string.false_toast
        }
      Toast.makeText(this,messageResId,Toast.LENGTH_SHORT).show()
    }
}