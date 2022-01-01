package com.example.implicitintentskotlin

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Implicit Intent:
 * Data share with another app installed in your app
 * example: sent email (user will select mail), share with (messanger, whatsapp etc)
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_takePhoto.setOnClickListener {
            // Create instance for Implicit Intent. exampleA: Intent.Action_.....
            Intent(Intent.ACTION_GET_CONTENT).also {
                it.type = "image/*"   // 'image/jpeg' will take only jpeg, 'image/png' will take only png but 'image/*' will take all type of image
                startActivityForResult(it,0)
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK && requestCode == 0 ){
            var uri = data?.data  // data path
            iv_photo.setImageURI(uri)
        }
    }
}