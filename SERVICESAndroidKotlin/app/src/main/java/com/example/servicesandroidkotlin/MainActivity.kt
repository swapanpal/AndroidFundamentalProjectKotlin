package com.example.servicesandroidkotlin

import android.content.Intent
import android.nfc.NfcAdapter.EXTRA_DATA
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_serviceStart.setOnClickListener {
            Intent(this, MyService :: class.java).also {
                startService(it)
                tv_serviceInfo.text = "Service running"
            }

        }
        btn_serviceStop.setOnClickListener {
            Intent(this, MyService :: class.java).also {
                stopService(it)
                tv_serviceInfo.text = "Service stopped"
            }

            btn_sendData.setOnClickListener {
                Intent(this, MyService :: class.java).also {
                    val dataString = et_data.text.toString()
                    it.putExtra("EXTRA_DATA", dataString)
                    startService(it)
                }

            }

        }
    }
    }
