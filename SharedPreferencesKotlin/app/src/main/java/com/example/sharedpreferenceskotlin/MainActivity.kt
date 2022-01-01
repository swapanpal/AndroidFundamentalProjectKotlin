package com.example.sharedpreferenceskotlin

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // First need to instance of sharedPreferences with editor
        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()

        // set clickListener to the save button
        btn_save.setOnClickListener {
            // extract data from editText
            val name = et_name.text.toString()
            val age = et_age.text.toString().toInt()
            val isAdult = cb_adult.isChecked

            // Save data to sharedPreferences
            editor.apply {
                putString("name", name)
                putInt("age", age)
                putBoolean("isAdult", isAdult)
                apply()   // must need to use apply()[asynchronously] or commit()[synchronously] function to save data
            }
        }
        btn_load.setOnClickListener {
            // Extract data from sharedPreferences
            val name = sharedPref.getString("name", null)
            val age = sharedPref.getInt("age", 0)
            val isAdult = sharedPref.getBoolean("isAdult", false)

            // Set the extracted data to display
            et_name.setText(name)
            et_age.setText(age.toString())
            cb_adult.isChecked = (isAdult)
        }
    }
}