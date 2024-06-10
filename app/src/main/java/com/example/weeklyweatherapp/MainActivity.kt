package com.example.weeklyweatherapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val proceed = findViewById<Button>(R.id.proceed)
        val leave = findViewById<Button>(R.id.leave)

        proceed.setOnClickListener{
            val intent = Intent(this, MainScreen::class.java)

            startActivity(intent)
        }
    }
}