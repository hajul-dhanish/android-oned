package com.example.zerod

import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_home.*


class HomeActivity : AppCompatActivity() {

    private var mRecyclerView: RecyclerView? = null
    private var mAdapter: RecyclerView.Adapter<*>? = null
    var listOfusers: ArrayList<Users> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE or WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)



        //adding items in list

        val NewTasktext:String =  addNewTaskid.text.toString()

        for (i in 0..1) {
            val user = Users()
            user.login = "Test $i"
            listOfusers.add(user)
        }

        addTaskButtonid.setOnClickListener {
            val newuser = Users()
            newuser.login = NewTasktext
            listOfusers.add(newuser)
        }

        mRecyclerView = findViewById(R.id.my_recycler_view)

            val mLayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
            mRecyclerView?.layoutManager = mLayoutManager

            mAdapter = Myadapter(listOfusers)
            mRecyclerView?.adapter = mAdapter

        }

    }

