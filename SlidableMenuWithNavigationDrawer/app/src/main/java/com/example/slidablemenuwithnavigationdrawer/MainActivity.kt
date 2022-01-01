package com.example.slidablemenuwithnavigationdrawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    // declare a variable for toggle drawable that will initialize later
    lateinit var toggle : ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize the toggle drawer
        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)

        // add listener to the drawerLayout
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        // for back arrow click to close the drawer
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // For clickable drawer menu item
        nav_view.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.mi_item1 -> Toast.makeText(applicationContext, "Clicked Item 1", Toast.LENGTH_SHORT).show()
                R.id.mi_item2 -> Toast.makeText(applicationContext, "Clicked Item 2", Toast.LENGTH_SHORT).show()
                R.id.mi_item3 -> Toast.makeText(applicationContext, "Clicked Item 3", Toast.LENGTH_SHORT).show()
            }
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}