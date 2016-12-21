package com.example.eoinahern.weather_app_kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.find
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val forecastlist : RecyclerView = find(R.id.forecast_list)
        forecastlist.layoutManager = LinearLayoutManager(this)
        toast("hello!")
    }




    fun toast(message : String, length: Int = Toast.LENGTH_SHORT) {
            Toast.makeText(this, message, length).show()
    }
}
