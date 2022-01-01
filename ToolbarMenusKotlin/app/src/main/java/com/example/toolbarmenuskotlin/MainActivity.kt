package com.example.toolbarmenuskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.app_bar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
       when(item.itemId){
           R.id.mi_addContact -> Toast.makeText(this, "You Clicked on Add Contact",Toast.LENGTH_SHORT).show()
           R.id.mi_favorites -> Toast.makeText(this, "You Clicked on Favorite",Toast.LENGTH_SHORT).show()
           R.id.mi_settings -> Toast.makeText(this, "You Clicked on Settings",Toast.LENGTH_SHORT).show()
           R.id.mi_close -> finish()
           R.id.mi_feedBack -> Toast.makeText(this, "You Clicked on Feedback",Toast.LENGTH_SHORT).show()
       }
        return true
    }
}