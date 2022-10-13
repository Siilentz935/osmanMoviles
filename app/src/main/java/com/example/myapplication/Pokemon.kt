package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class Pokemon : AppCompatActivity() {

    private lateinit var nextButton: Button
    private lateinit var questionTextView: ImageView
    private  lateinit var name: TextView

    private val PokemonClass = listOf(
        Pokemons("Articuno",R.drawable.articuno,true),
        Pokemons("Bayleef",R.drawable.bayleef,false),
        Pokemons("Beautifly",R.drawable.beautifly,false),
        Pokemons("Bonsly",R.drawable.bonsly,false),
        Pokemons("Charizard",R.drawable.charizard,false),
        Pokemons("Dewgong",R.drawable.dewgong,false),
        Pokemons("Espeon",R.drawable.espeon,false),
        Pokemons("Furret",R.drawable.furret,false),
        Pokemons("Houndoom",R.drawable.houndoom,false),
        Pokemons("Ivysour",R.drawable.ivysour,false),
        Pokemons("Lapras",R.drawable.lapras,false),
        Pokemons("Leafeon",R.drawable.leafeon,false),
        Pokemons("Lucario",R.drawable.lucario,false),
        Pokemons("Lugia",R.drawable.lugia,true),
        Pokemons("Marowak",R.drawable.marowak,false),
        Pokemons("Mewtwo",R.drawable.mewtwo,true),
        Pokemons("Munchlax",R.drawable.munchlax,false),
        Pokemons("Nidorina",R.drawable.nidorina,false),
        Pokemons("Ninetales",R.drawable.ninetales,false),
        Pokemons("Pidgeotto",R.drawable.pidgeotto,false),
        Pokemons("Snivy",R.drawable.snivy,false),
        Pokemons("Suicune",R.drawable.suicune,true),
        Pokemons("Togetic",R.drawable.togetic,false)
    )
    private var currentIndex=-1
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pokemon)
        nextButton = findViewById(R.id.btnSigPokemon)
        questionTextView = findViewById(R.id.imgPokemon)
        name = findViewById(R.id.nombrePoke)
        nextButton.setOnClickListener {
            currentIndex = (currentIndex + 1)%PokemonClass.size

            updateQuestion()

        }
    }
    private fun updateQuestion(){
        val questionTextResId = PokemonClass[currentIndex].name
        questionTextView.setImageResource(PokemonClass[currentIndex].image)
        name.setText(questionTextResId)
        checkAnswer(PokemonClass[currentIndex].isLegendary)
    }
    private fun checkAnswer(userAnswer: Boolean){
        val correctAnswer = PokemonClass[currentIndex].isLegendary
        var const: ConstraintLayout = findViewById(R.id.lytPokemon)
         if (correctAnswer ){
            const.setBackgroundColor(Color.RED)
        }else{
             const.setBackgroundColor(Color.WHITE)
        }
    }
}