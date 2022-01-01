package com.example.fragmentsfundamentalskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()

        // when the app run it will show first fragment
        supportFragmentManager.apply {
            beginTransaction().replace(R.id.fl_fragment, firstFragment)
                .commit()
        }

        // set click listener to the first button
        btn_fragment1.setOnClickListener {
            supportFragmentManager.apply {
                beginTransaction().replace(R.id.fl_fragment, firstFragment)  // replace() function replace the view with given fragment
                    .addToBackStack(null)   // for back button, it will back to existing stack
                    .commit()
            }
        }
        // set click listener to the second button
        btn_fragment2.setOnClickListener {
            supportFragmentManager.apply {
                beginTransaction().replace(R.id.fl_fragment, secondFragment)   // replace() function replace the view with given fragment
                    .addToBackStack(null)  // for back button, it will back to existing stack
                    .commit()
            }
        }
    }
}