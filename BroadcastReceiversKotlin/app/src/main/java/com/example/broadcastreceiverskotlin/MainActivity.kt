package com.example.broadcastreceiverskotlin

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    // (1) create an instance of AirplaneModeChangedReceiver class
    lateinit var receiver : AirplaneModeChangedReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // initialize the receiver
        receiver = AirplaneModeChangedReceiver()

        // (2) register the IntentFilter for which intent is using
        IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED).also {
            registerReceiver(receiver,it)
        }
    }

    // (3) must override the onStop() function to refuse memory leak
    override fun onStop() {
        super.onStop()
        unregisterReceiver(receiver)
    }
}