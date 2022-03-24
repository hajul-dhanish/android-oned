package com.example.zerod

import android.content.Intent
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val actionBar: ActionBar? = supportActionBar
        actionBar?.hide()

        setContentView(R.layout.activity_main)

        createAccid.setOnClickListener {
            val userName: String = mainUserName.text.toString()
            val emailAdd: String = emailid.text.toString()
            val passWord: String = passid.text.toString()

            if (userName.isNotEmpty() and emailAdd.isNotEmpty() and passWord.isNotEmpty()){
                Toast.makeText(
                    this@MainActivity,
                    "Hi, $userName, Will Update in Upcoming Version...",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                Toast.makeText(
                    this@MainActivity,
                    "Please Fill the form buddy :/",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

            skipToMainPageid.setOnClickListener {

                val radioCkAns = radioGrp.checkedRadioButtonId
                val radioButton = findViewById<RadioButton>(radioCkAns)

                if(radioButton == mid){
                    Toast.makeText(
                        this@MainActivity,
                        "No Man allowed \uD83D\uDE20 , At this Point We only allow women",
                        Toast.LENGTH_SHORT
                    ).show()
                } else{
                    val intent = Intent(this, HomeActivity::class.java)
                    startActivity(intent)
                }
            }

    }
}