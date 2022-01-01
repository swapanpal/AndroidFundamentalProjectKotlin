package com.example.intentservicekotlin

import android.app.IntentService
import android.content.Intent
import android.util.Log

// Need a class for every intent service
class MyIntentService : IntentService("MyIntentService") {

    init {
        instance = this
    }
    companion object{
       private lateinit var instance :MyIntentService
       var isRunning = false

        fun stopService(){
            Log.d("MyIntentService", "Service is stopping...")
            isRunning = false
            instance.stopSelf()
        }
    }

    override fun onHandleIntent(intent: Intent?) {
      try {
          isRunning = true
          while (isRunning){
              Log.d("MyIntentService", "Service is running...")
              Thread.sleep(1000)
          }
      }catch (e : InterruptedException){
          Thread.currentThread().interrupt()
      }
    }
}