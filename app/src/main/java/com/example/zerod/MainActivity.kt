package com.example.zerod

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //<To Hide Action Bar
        val actionBar: ActionBar? = supportActionBar
        actionBar?.hide()



//  When CLicked "Create Account" Button
        createAccid.setOnClickListener {
            val userName: String = mainUserName.text.toString()
            val emailAdd: String = emailid.text.toString()
            val passWord: String = passid.text.toString()

            if (userName.isNotEmpty() and emailAdd.isNotEmpty() and passWord.isNotEmpty()){
                Toast.makeText(
                    this@MainActivity,
                    "Hi, $userName, Will Update in Upcoming Version..., For now, Just Skip to home",
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

//  When Clicked "Sharable Username" Button
            skipToMainPageid.setOnClickListener {
                val userName: String = mainUserName.text.toString()
                val emailAdd: String = emailid.text.toString()
                val passWord: String = passid.text.toString()

                val radioCkAns = radioGrp.checkedRadioButtonId
                val radioButton = findViewById<RadioButton>(radioCkAns)

                when {
                    radioButton == mid -> {
                        Toast.makeText(
                            this@MainActivity,
                            "No Man allowed \uD83D\uDE20 , At this Point We only allow women",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                    userName.isEmpty() and emailAdd.isEmpty() and passWord.isEmpty() -> {

                        requiredSyntextForm_username.isVisible = true
                        requiredSyntextForm_email.isVisible = true
                        requiredSyntextForm_pass.isVisible = true
                        requiredSyntextForm_gender.isVisible = true

                        Toast.makeText(
                            this@MainActivity,
                            "Please Fill the form buddy :/",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                    userName.isNotEmpty() and emailAdd.isNotEmpty() and passWord.isNotEmpty() -> {
                        val intent = Intent(this, TestAction::class.java)
                        intent.putExtra("userNameShared", userName)
                        intent.putExtra("emailNameShared", emailAdd)
                        intent.putExtra("genderNameShared", radioCkAns)
                        startActivity(intent)
                    }
                }
            }

//  When Clicked "Skip to HomePage" Button
        kernalMainPageid.setOnClickListener {
            val userName: String = mainUserName.text.toString()
            val emailAdd: String = emailid.text.toString()
            val passWord: String = passid.text.toString()

            val radioCkAns = radioGrp.checkedRadioButtonId
            val radioButton = findViewById<RadioButton>(radioCkAns)

            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

    }
}
