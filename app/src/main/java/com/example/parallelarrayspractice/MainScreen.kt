package com.example.parallelarrayspractice

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        // Directly initialize the arrays
        val dates = mutableListOf<String>()
        val afternoonScreenTime = mutableListOf<String>()
        val morningScreenTime = mutableListOf<String>()

        // Initialize the views
        val inputDate = findViewById<EditText>(R.id.InputDate)
        val inputAfternoonMin = findViewById<EditText>(R.id.InputAfternoonMin)
        val inputMorningMin = findViewById<EditText>(R.id.InputMorningMin)
        val submitDateBtn = findViewById<Button>(R.id.submitDatebtn)
        val submitMinuteAfternoonsBtn = findViewById<Button>(R.id.submitMinuteAfternoonsbtn)
        val submitMinutesMorningBtn = findViewById<Button>(R.id.submitMinutesMorningbtn)
        val NavigateDetailsPage = findViewById<Button>(R.id.NavigateDetailsPage)

        // Set up the first button click listener to add input to dates array
        submitDateBtn.setOnClickListener {
            val dateText = inputDate.text.toString()
            if (dateText.isNotEmpty()) {
                dates.add(dateText)
                inputDate.text.clear()
            }
        }

        // Set up the second button click listener to add input to afternoonScreenTime array
        submitMinuteAfternoonsBtn.setOnClickListener {
            val afternoonMinutesText = inputAfternoonMin.text.toString()
            if (afternoonMinutesText.isNotEmpty()) {
                afternoonScreenTime.add(afternoonMinutesText)
                inputAfternoonMin.text.clear()
            }
        }

        // Set up the third button click listener to add input to morningScreenTime array
        submitMinutesMorningBtn.setOnClickListener {
            val morningMinutesText = inputMorningMin.text.toString()
            if (morningMinutesText.isNotEmpty()) {
                morningScreenTime.add(morningMinutesText)
                inputMorningMin.text.clear()
            }
        }

        // Set up the button to display data on the next screen
        NavigateDetailsPage.setOnClickListener {
            val intent = Intent(this, DetailedViewScreen::class.java)
            intent.putStringArrayListExtra("dates", ArrayList(dates))
            intent.putStringArrayListExtra("afternoonScreenTime", ArrayList(afternoonScreenTime))
            intent.putStringArrayListExtra("morningScreenTime", ArrayList(morningScreenTime))
            startActivity(intent)
        }
    }
}
