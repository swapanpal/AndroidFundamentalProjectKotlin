package com.example.addtwonumberproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_addNumber.setOnClickListener {
            val firstNumber = et_firstNumber.text.toString().toInt()
            val secondNumber = et_secondNumber.text.toString().toInt()
            val result = firstNumber + secondNumber

            tv_result.text = result.toString()
        }
    }
}