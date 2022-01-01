package com.example.parssingdatabetweenactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_apply.setOnClickListener {
            // extract the value of editText
            val name = et_name.text.toString()
            val age = et_age.text.toString().toInt()
            val country = et_country.text.toString()

            // create an object of data class
            val person = Person(name, age, country)
            // get an instance of Intent object
            Intent(this, SecondActivity::class.java).apply {

                /** If we used data class than no need this extraction
                this.putExtra("EXTRA_NAME", name)
                this.putExtra("EXTRA_AGE", age)
                this.putExtra("EXTRA_COUNTRY", country)
                // start the activity
                */
                this.putExtra("EXTRA_PERSON", person)
                startActivity(this)
            }
        }
    }
}