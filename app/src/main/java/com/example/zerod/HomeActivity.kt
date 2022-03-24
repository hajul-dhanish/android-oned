package com.example.zerod

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val bundle: Bundle = intent.extras!!
        val useName = bundle.getString("userInputName")

        Toast.makeText(this, "$mainUserName is gay :(", Toast.LENGTH_SHORT).show()
    }

}