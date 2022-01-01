package com.example.intentservicekotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_serviceStart.setOnClickListener {
            Intent(this, MyIntentService :: class.java).also {
                startService(it)
                tv_serviceInfo.text = "Service running"
            }

        }
        btn_serviceStop.setOnClickListener {
            MyIntentService.stopService()
            tv_serviceInfo.text = "Service stopped"
        }
    }
}