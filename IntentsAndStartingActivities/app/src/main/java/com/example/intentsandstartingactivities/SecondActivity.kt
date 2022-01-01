package com.example.intentsandstartingactivities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        btn_back.setOnClickListener {
            // close the current activity, that will go back to main activity
            finish()
        }

        btn_nextActivity.setOnClickListener {
            Intent(this,ThirdActivity::class.java).apply {
                startActivity(this)
            }
        }
    }
}