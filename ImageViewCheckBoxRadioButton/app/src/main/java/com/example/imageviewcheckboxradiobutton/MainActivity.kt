package com.example.imageviewcheckboxradiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    // set onClickListener to the addPicture button to add picture
    btn_addPicture.setOnClickListener {
        iv_image.setImageResource(R.drawable.burger)
    }
        // set onClickListener to the Order button to show which item you ordered
        btn_order.setOnClickListener {
            val checkedMeatRadioButtonId = rg_meat.checkedRadioButtonId
            val meat = findViewById<RadioButton>(checkedMeatRadioButtonId)
            val cheese = cb_cheese.isChecked
            val onions = cb_onions.isChecked
            val salad = cb_salad.isChecked
            val orderString = "You ordered a burger with : \n" +
                    "${meat.text}" +
                    (if (cheese) "\nCheese" else "") +
                    (if (onions) "\nOnions" else "") +
                    (if (salad) "\nSalad" else "")

            tv_order.text = orderString

        }

    }
}