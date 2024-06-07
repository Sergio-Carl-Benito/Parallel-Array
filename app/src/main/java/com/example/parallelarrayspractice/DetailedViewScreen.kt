package com.example.parallelarrayspractice

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class DetailedViewScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_view_screen)

        // Get the ListView
        val listView: ListView = findViewById(R.id.yourTimeSpent)

        // Get the data passed from MainScreen
        val dates = intent.getStringArrayListExtra("dates")
        val afternoonScreenTime = intent.getStringArrayListExtra("afternoonScreenTime")
        val morningScreenTime = intent.getStringArrayListExtra("morningScreenTime")

        // Combine all data into a single list for display
        val combinedData = mutableListOf<String>()
        dates?.let { combinedData.addAll(it) }
        afternoonScreenTime?.let { combinedData.addAll(it) }
        morningScreenTime?.let { combinedData.addAll(it) }

        // Create an ArrayAdapter
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, combinedData)

        // Set the adapter to the ListView
        listView.adapter = adapter
    }
}
