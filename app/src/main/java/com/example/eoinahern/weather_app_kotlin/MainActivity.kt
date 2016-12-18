package com.example.eoinahern.weather_app_kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val forecastlist = findViewById(R.id.forecast_list) as RecyclerView
        forecastlist.layoutManager = LinearLayoutManager(this)



        toast(message = "go fork yoself", length = Toast.LENGTH_LONG)
    }



    fun toast(message : String, length: Int = Toast.LENGTH_SHORT) {
            Toast.makeText(this, message, length).show()
    }
}
