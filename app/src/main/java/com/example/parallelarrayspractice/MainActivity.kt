package com.example.parallelarrayspractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val NavigateMainscreen = findViewById<Button>(R.id.NavigateMainscreen)
        // Set up the button to display data on the next screen
        NavigateMainscreen.setOnClickListener {
            val intent = Intent(this, MainScreen::class.java)
            startActivity(intent)
        }





    }
}