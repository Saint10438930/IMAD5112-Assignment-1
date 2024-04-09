package com.example.historyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Declaring the views
        val ageNumber = findViewById<EditText>(R.id.ageNumber)
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val btnClear = findViewById<Button>(R.id.btnClear)
        val txtResult = findViewById<TextView>(R.id.txtResult)
        //Input age number
        btnGenerate.setOnClickListener {
            val age = ageNumber.text.toString().toIntOrNull()
            if (age != null){
                val result = when (age){
                    in 20 .. 25 -> "Aaliyah"
                    in 26 .. 30 -> "King Von"
                    in 31 .. 39 -> "Bob Marley"
                    in 40 .. 50 -> "Virgil Abloh"
                    in 50 .. 59 -> "DMX"
                    in 60 .. 69 -> "Diego Maradona"
                    in 70 .. 79 -> "Luis Vuitton"
                    in 80 .. 89 -> "Anne Francis"
                    in 90 .. 95 -> "Pablo Picasso"
                    in 96 .. 100 -> "Grim Natwick"
                    else -> "Incorrect"
                }
                //Results shown after you enter age
                txtResult.text = "Age: $age\n${
                    when (result){
                        "Aaliyah" -> "You are in the same age range as Aaliyah, who passed away at age 22."
                        "King Von" -> "You are in the same age range as King Von, who passed away at age 26."
                        "Bob Marley" -> "You are in the same age range as Bob Marley, who passed away at age 36"
                        "Virgil Abloh" -> "You are in the same age range as Virgil Abloh, who passed away at age 41"
                        "DMX" -> "You are in the same age range as DMX, who passed away at age 50"
                        "Diego Maradona" -> "You are in the same age range as Diego Maradona, who passed away at age 60"
                        "Luis Vuitton" -> "You are in the same age range as Kuis Vuitton, who passed away at age 70"
                        "Anne Francis" -> "You are in the same age range as Anne Francis, who passed away at age 80"
                        "Pablo Picasso" -> "You are in the same age range as Pablo Picasso, who passed away at age 91"
                        "Grim Natwick" -> "You are in the same age range as Grim Watwick, who passed away at age 100"
                        else -> "You are out of bound. Please Enter Valid Age Number"
                    }
                }"
            } else {
                txtResult.text = "Please enter a valid age"
            }
        }

        btnClear.setOnClickListener{
            ageNumber.text.clear()
            txtResult.text = ""
        }
    }
}