package com.example.icetask5

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import com.google.androidgamesdk.GameActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent()

        // Button to navigate to the second screen
        val startButton = findViewById<Button>(R.id.startButton)
        startButton.setOnClickListener {
            val intent = Intent(this, GameActivity::class.java)// GameActivity: name of the second activity
// Pass the message "I am hungry" as an extra with the intent
            intent.putExtra("FEED_MESSAGE", "I am hungry")//This will be shown in the feedTextView
            startActivity(intent)
        }
    }

    private fun setContent() {
        TODO("Not yet implemented")
    }
}


