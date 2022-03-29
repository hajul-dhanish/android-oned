package com.example.zerod

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_test_action.*

class TestAction : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_action)

//  Passing The data into another Activity
        val bundle: Bundle? = intent.extras
        val useName = bundle!!.getString("userNameShared")
        val emailName = bundle.getString("emailNameShared")
        val genderName = bundle.getString("genderNameShared")

        txvtest.text = "Hello $useName, Welcome to Android :)"

//  initialization of value
        usernameHolderid.text = useName
        emailHolderid.text = emailName
        genderHolderid.text = genderName

// When "Sharable Username" Button clicked
        shareButtonid.setOnClickListener{
            val sharableText: String = txvtest.text.toString()
// Implicit intent
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, sharableText)
            intent.type = "image/jpg"
            startActivity(Intent.createChooser(intent, "Share to : "))
        }

//  When Click "Delete Icon"
        DeleteAccountid.setOnClickListener{
            usernameHolderid.text = null
            emailHolderid.text = null
            txvtest.text = null
        }

//  when Click "Validate Account"
        verifyAccountid.setOnClickListener {

        }

    }
}

