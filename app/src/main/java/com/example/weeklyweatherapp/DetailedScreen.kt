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

    val high = arrayOf<String>("24",
        "22",
        "23",
        "25",
        "26",
        "18",
        "16")

    val low = arrayOf<String>("15",
        "13",
        "14",
        "14",
        "16",
        "9",
        "4")

    val sun = arrayOf<String>("Sunny",
        "Sunny",
        "")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detailed_screen)

        val daysOfWeek = findViewById<TextView>(R.id.daysOfWeek)
        val max = findViewById<TextView>(R.id.max)
        val min = findViewById<TextView>(R.id.min)
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

        //Displays the maximum temperature
        var maxTemp = ""
        maxTemp += "${high[0]}\n"
        maxTemp += "${high[1]}\n"
        maxTemp += "${high[2]}\n"
        maxTemp += "${high[3]}\n"
        maxTemp += "${high[4]}\n"
        maxTemp += "${high[5]}\n"
        maxTemp += "${high[6]}\n"
        max.text = maxTemp

        //Displays the minimum temperatures
        var minTemp = ""
        minTemp += "${low[0]}\n"
        minTemp += "${low[1]}\n"
        minTemp += "${low[2]}\n"
        minTemp += "${low[3]}\n"
        minTemp += "${low[4]}\n"
        minTemp += "${low[5]}\n"
        minTemp += "${low[6]}\n"
        min.text = minTemp

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