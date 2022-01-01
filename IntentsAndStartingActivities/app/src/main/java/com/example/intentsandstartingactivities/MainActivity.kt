package com.example.intentsandstartingactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set onClickListener on the openActivity button
        btn_openActivity.setOnClickListener {
            // Create an instance of Intent
            Intent(this, SecondActivity ::class.java).also {
                // Start the activity
                startActivity(it)
            }
        }
    }
}