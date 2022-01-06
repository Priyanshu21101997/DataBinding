package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // METHOD _ !

//        val activityMainBinding = DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)

//        activityMainBinding.myVariable = "Hello Data Binding"

        // METHOD _ 2

        val activityMainBinding = DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)

        val userVar = User(23,"Priyanka",true,"https://images.unsplash.com/photo-1641492404325-2f3a6ee857ae?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MnwyODIwNjJ8MHwxfGFsbHwyfHx8fHx8Mnx8MTY0MTUwMzA5Mg&ixlib=rb-1.2.1&q=80&w=200")

        activityMainBinding.user = userVar

        // Handle event click method - 1
        // BUtton CLick

//        activityMainBinding.button.setOnClickListener{
//            Toast.makeText(this,"Toast",Toast.LENGTH_LONG).show()
//        }

    }
}