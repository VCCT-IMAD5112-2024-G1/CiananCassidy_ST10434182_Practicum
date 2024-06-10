package com.example.weeklyweatherapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.Button
import android.widget.EditText

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
        val result = findViewById<TextView>(R.id.result)
        val monMax = findViewById<EditText>(R.id.monMax)
        val monMin = findViewById<EditText>(R.id.monMin)
        val tuesMax = findViewById<EditText>(R.id.tuesMax)
        val tuesMin = findViewById<EditText>(R.id.tuesMin)
        val wedMax = findViewById<EditText>(R.id.wedMax)
        val wedMin = findViewById<EditText>(R.id.wedMin)
        val thurMax = findViewById<EditText>(R.id.thurMax)
        val thurMin = findViewById<EditText>(R.id.thurMin)
        val friMax = findViewById<EditText>(R.id. friMax)
        val friMin = findViewById<EditText>(R.id.friMin)
        val satMax = findViewById<EditText>(R.id.satMax)
        val satMin = findViewById<EditText>(R.id.satMin)
        val sunMax = findViewById<EditText>(R.id.sunMax)
        val sunMin = findViewById<EditText>(R.id.sunMin)


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

        //Calculation
        var average = ""
        average += "$monMax + $monMin / 2 = ${result}\n"
        average += "$tuesMax + $tuesMin / 2 = ${result}\n"
        average += "$wedMax + $wedMin / 2 = ${result}\n"
        average += "$thurMax + $thurMin / 2 = ${result}\n"
        average += "$friMax + $friMin / 2 = ${result}\n"
        average += "$satMax + $satMin / 2 = ${result}\n"
        average += "$sunMax + $sunMin / 2 = ${result}\n"


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
            intent.putExtras("result",
                result.text.toString())
            startActivity(intent)
        }


    }
}