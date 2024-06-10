package com.example.weeklyweatherapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.Button

class DetailedScreen : AppCompatActivity() {

    private val week = arrayOf<String>("Monday",
        "Tuesday",
        "Wednesday",
        "Thursday",
        "Friday",
        "Saturday",
        "Sunday")



    val sun = arrayOf<String>("Sunny",
        "Sunny",
        "Sunny",
        "Partly Cloudy",
        "Raining",
        "Foggy",
        "Foggy")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detailed_screen)

        val daysOfWeek = findViewById<TextView>(R.id.daysOfWeek)
        val sky = findViewById<TextView>(R.id.sky)
        val back = findViewById<Button>(R.id.back)

        //Displays the days of the week
        var daysDisplay = ""
        daysDisplay += "${week[0]}\n"
        daysDisplay += "${week[1]}\n"
        daysDisplay += "${week[2]}\n"
        daysDisplay += "${week[3]}\n"
        daysDisplay += "${week[4]}\n"
        daysDisplay += "${week[5]}\n"
        daysDisplay += "${week[6]}\n"
        daysOfWeek.text = daysDisplay

        //Displays Cloud cover
        var cloudCover = ""
        cloudCover += "${sun[0]}\n"
        cloudCover += "${sun[1]}\n"
        cloudCover += "${sun[2]}\n"
        cloudCover += "${sun[3]}\n"
        cloudCover += "${sun[4]}\n"
        cloudCover += "${sun[5]}\n"
        cloudCover += "${sun[6]}\n"
        sky.text = cloudCover

        //Return to main screen
        back.setOnClickListener{
            val intent = Intent(this, MainScreen::class.java)

            startActivity(intent)
        }


    }
}