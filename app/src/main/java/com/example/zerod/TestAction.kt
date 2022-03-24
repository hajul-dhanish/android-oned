package com.example.zerod

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*

class TestAction : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_action)

        val bundle: Bundle = intent.extras!!
        val useName = bundle.getString("userNamea")

//        Toast.makeText(this, "HI $useName, Welcome Home :)", Toast.LENGTH_SHORT).show()
        txvtest.text = "Hello $useName, Welcome to Android :)"


        shareButtonid.setOnClickListener{
            val sharableText: String = txvtest.text.toString()

            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, sharableText)
            intent.type = "text/plain"

            startActivity(Intent.createChooser(intent, "Share to : "))
        }

    }
}