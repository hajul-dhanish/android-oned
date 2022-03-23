package com.example.zerod

import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val userName: String = mainUserName.text.toString()
//        val emailAdd: String = emailid.text.toString()
//        val passWord: String = passid.text.toString()

//        val radioCkAns = radioGrp.checkedRadioButtonId
//        val radioButton = findViewById<RadioButton>(radioCkAns)


        createAccid.setOnClickListener {
            Toast.makeText(
                this@MainActivity,
                "Will Update in Upcoming Version...",
                Toast.LENGTH_SHORT
            ).show() }

            skipToMainPageid.setOnClickListener {
                Toast.makeText(this, "On the Way fam :) ", Toast.LENGTH_SHORT).show()
            }

    }
}