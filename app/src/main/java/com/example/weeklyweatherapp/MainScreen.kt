package com.example.weeklyweatherapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class MainScreen : AppCompatActivity() {
    private val week = arrayOf<String>("Monday",
        "Tuesday",
        "Wednesday",
        "Thursday",
        "Friday",
        "Saturday",
        "Sunday")


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_screen)

        //Declarations
        val weather = findViewById<TextView>(R.id.weather)
        val average = findViewById<TextView>(R.id.average)
        val details = findViewById<Button>(R.id.details)
        val exit = findViewById<Button>(R.id.exit)

        //Displays the days of the week
        var daysDisplay = ""
        daysDisplay += "${week[0]}\n"
        daysDisplay += "${week[1]}\n"
        daysDisplay += "${week[2]}\n"
        daysDisplay += "${week[3]}\n"
        daysDisplay += "${week[4]}\n"
        daysDisplay += "${week[5]}\n"
        daysDisplay += "${week[6]}\n"
        weather.text = daysDisplay

        //Calculation
        var aveDisplay = ""
        aveDisplay +=

        details.setOnClickListener {
            val intent = Intent(this, DetailedScreen::class.java)

            startActivity(intent)
        }

        exit.setOnClickListener{
            finishAffinity()
        }
    }
}