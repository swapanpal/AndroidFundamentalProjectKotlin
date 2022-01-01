package com.example.parssingdatabetweenactivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // Extract the value from intent if not use data class
        /**
        val name = intent.getStringExtra("EXTRA_NAME")
        val age = intent.getIntExtra("EXTRA_AGE", 0)
        val country = intent.getStringExtra("EXTRA_COUNTRY")

        */
        val person = intent.getSerializableExtra("EXTRA_PERSON") as Person
        //val personString = "$name is $age years old and lives in $country"

        // Set the text to textView
        //tv_person.text = personString
        tv_person.text = person.toString()
    }
}