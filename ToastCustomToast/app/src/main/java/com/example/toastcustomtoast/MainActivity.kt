package com.example.toastcustomtoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View.inflate
import android.widget.Toast
import androidx.core.content.res.ColorStateListInflaterCompat.inflate
import androidx.core.content.res.ComplexColorCompat.inflate
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.custom_toast.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_viewToast.setOnClickListener {
            // default toast
          // Toast.makeText(applicationContext, "This is a toast",Toast.LENGTH_LONG).show()

            // Custom toast
            Toast(this).apply {
                view = layoutInflater.inflate(R.layout.custom_toast,cl_toast)
                show()
            }

        }
    }
}