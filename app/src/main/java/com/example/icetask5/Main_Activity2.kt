package com.example.icetask5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val petImageView = findViewById<ImageView>(R.id.petImageView)
        val feedButton = findViewById<Button>(R.id.feedButton)
        val cleanButton = findViewById<Button>(R.id.cleanButton)
        val playButton = findViewById<Button>(R.id.playButton)

        val feedTextView = findViewById<TextView>(R.id.feedTextView)
        val cleanTextView = findViewById<TextView>(R.id.cleanTextView)
        val playTextView = findViewById<TextView>(R.id.playTextView)

        // Retrieve the message passed from the first screen
        val feedMessage = intent.getStringExtra("FEED_MESSAGE")
        // Set the text of the feed TextView to the feed message
        feedTextView.text = feedMessage


        // Logic for the Feed button
        feedButton.setOnClickListener {
            // Change the pet's image to match feeding action icon
            petImageView.setImageResource(R.drawable.pet_image_feeding)//replace text in bold with   your picture name

            // Update the pet's status values (e.g., health, hunger, cleanliness)
            // Update the feed TextView
            feedTextView.text = getString(R.string.feed)

            // Update the feed TextView
            playTextView.text = getString(R.string.Thank_you_so_much_for_feeding_me)

        }

        // Logic for the Clean button
        cleanButton.setOnClickListener {
            // Change the pet's image to match cleaning action icon
            petImageView.setImageResource(R.drawable.pet_image_cleaning)//your picture name here

            // Update the pet's status values (e.g., health, hunger, cleanliness)
            // The clean textview
            cleanTextView.text = getString(R.string.Clean)
            // Update the clean textview
            cleanTextView.text = getString(R.string.I_enjoyed_the_bubbles)

        }
        
        // Logic for the Play button
        playButton.setOnClickListener {
            // Change the pet's image to match playing action icon
            petImageView.setImageResource(R.drawable.pet_image_playing)//your picture name here

            // Update the pet's status values (e.g., health, hunger, cleanliness)
            // The play TextView
            playTextView.text = getString(R.string.Play)
            // Update the play textview
            playTextView.text = getString(R.string.I_had_so_much_fun_playing)

        }
    }
}

