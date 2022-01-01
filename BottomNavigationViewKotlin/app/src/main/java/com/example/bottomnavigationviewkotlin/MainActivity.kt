package com.example.bottomnavigationviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // (2) Initialize all fragments
        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()
        val thirdFragment = ThirdFragment()

        // (3) Call the function to show initial view
        setCurrentFragment(firstFragment)


        // set listener to the bottomNavigationView for clickable menu item
        bottomNavigationView.setOnNavigationItemSelectedListener {
           when(it.itemId){
               R.id.mi_home -> setCurrentFragment(firstFragment)
               R.id.mi_messages -> setCurrentFragment(secondFragment)
               R.id.mi_profile -> setCurrentFragment(thirdFragment)
           }
            // set the return value to true as it is lamda funciton
            true
        }
        // To set badge(count how many message have in specific menu)
        bottomNavigationView.getOrCreateBadge(R.id.mi_messages).apply {
            number = 10
            isVisible = true
        }
    }
    //(1) create a function to replace current view to a fragment
    private fun setCurrentFragment(fragment : Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_fragment, fragment)
                .commit()
        }
        }
