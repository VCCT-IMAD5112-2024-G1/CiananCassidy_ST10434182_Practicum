package com.example.weeklyweatherapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainScreen : AppCompatActivity() {
    private val week = arrayOf<String>("Monday",
        "Tuesday",
        "Wednesday",
        "Thursday",
        "Friday",
        "Saturday",
        "Sunday")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_screen)

        val details = findViewById<Button>(R.id.details)
        val exit = findViewById<Button>(R.id.exit)

        details.setOnClickListener {
            val intent = Intent(this, DetailedScreen::class.java)

            startActivity(intent)
        }

        exit.setOnClickListener{
            finishAffinity()
        }
    }
}