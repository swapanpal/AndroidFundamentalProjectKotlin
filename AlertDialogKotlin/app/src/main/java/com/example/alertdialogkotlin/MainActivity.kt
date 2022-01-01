package com.example.alertdialogkotlin

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Create an alert Dialog  (General alert dialog)
        val addContactDiolog = AlertDialog.Builder(this)
            .setTitle("Add Contact")
            .setMessage("Do you want to add Mr. Poop to your contact list?")
            .setIcon(R.drawable.ic_add_contact)
            .setPositiveButton("Yes") { _,_ ->
                Toast.makeText(this, "You add Mr. Poop to your contact list",Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("No") { _,_ ->
                Toast.makeText(this, "You didn't add Mr. Poop to your contact list",Toast.LENGTH_SHORT).show()
            }
            .create()

        // show the dialog by clicking the button
        btn_dialog1.setOnClickListener {
            addContactDiolog.show()
        }


        //  Create a singleChoose dialog from a array list
        val options = arrayOf("First Item", "Second Item", "Third Item")
        val  singleChooseDialog = AlertDialog.Builder(this)
            .setTitle("Choose one of these options")
            .setSingleChoiceItems(options, 0) { dialogInterface, i ->
                Toast.makeText(this, "You clicked on ${options[i]} item", Toast.LENGTH_SHORT).show()
            }
            .setPositiveButton("Accept") { _,_ ->
                Toast.makeText(this, "You accepted the singleChooseDialog",Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Decline") { _,_ ->
                Toast.makeText(this, "YYou declined the singleChooseDialog",Toast.LENGTH_SHORT).show()
            }
            .create()

        // Show the singleChoseDialog by clicking the second button
        btn_dialog2.setOnClickListener {
            singleChooseDialog.show()
        }

        // Create a multichooseAlertDialog
        val  multiChooseDialog = AlertDialog.Builder(this)
            .setTitle("Choose one of these options")
            .setMultiChoiceItems(options, booleanArrayOf(false, false, false)) { _, index, isChecked ->
                if (isChecked){
                    Toast.makeText(this, "You Checked ${options[index]}", Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(this, "You Unchecked ${options[index]}", Toast.LENGTH_SHORT).show()
                }

            }
            .setPositiveButton("Accept") { _,_ ->
                Toast.makeText(this, "You accepted the multiChooseDialog",Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Decline") { _,_ ->
                Toast.makeText(this, "YYou declined the multiChooseDialog",Toast.LENGTH_SHORT).show()
            }
            .create()

        btn_dialog3.setOnClickListener {
            multiChooseDialog.show()
        }


    }
}