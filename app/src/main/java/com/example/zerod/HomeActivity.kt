package com.example.zerod

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class HomeActivity : AppCompatActivity() {

    private var mRecyclerView: RecyclerView? = null
    private var mAdapter: RecyclerView.Adapter<*>? = null
    private var listOfusers: ArrayList<Users> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        // finding the button
        val addNewButton = findViewById<Button>(R.id.addTaskButtonid)
        val deleteTaskButton = findViewById<ImageButton>(R.id.deleteTaskButtonid)

        // finding the edit text
        val newTask = findViewById<EditText>(R.id.addNewTaskid)

//        val newTask:String =  addNewTaskid.text.toString( // <Error intha line la blah blah blah >
//
//        // adding items in list
//        for (i in 0..1) {
//            val user = Users()
//            user.login = "Test $i"
//            listOfusers.add(user)
//        }



        addNewButton.setOnClickListener {

            val addNewText = newTask.text.toString()
            val newUser = Users()
            newUser.login = addNewText

            if(addNewText.isNotEmpty()){
                listOfusers.add(newUser)
            } else {
                Toast.makeText(this, "Value Can't be Null!" , Toast.LENGTH_SHORT).show()
            }

        }

        deleteTaskButton.setOnClickListener{
            listOfusers.removeAll(listOf(Users()))
        }

        // find recycle view
        mRecyclerView = findViewById(R.id.my_recycler_view)

            val mLayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
            mRecyclerView?.layoutManager = mLayoutManager

            mAdapter = Myadapter(listOfusers)
            mRecyclerView?.adapter = mAdapter

        }

    }


