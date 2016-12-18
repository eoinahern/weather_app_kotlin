package com.example.eoinahern.weather_app_kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val items = listOf(  "Mon 6/23 - Sunny - 31/17",
            "Tue 6/24 - Foggy - 21/8",
            "Wed 6/25 - Cloudy - 22/17",
            "Thurs 6/26 - Rainy - 18/11",
            "Fri 6/27 - Foggy - 21/10",
            "Sat 6/28 - TRAPPED IN WEATHERSTATION - 23/18",
            "Sun 6/29 - Sunny - 20/7"  )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val forecastlist = findViewById(R.id.forecast_list) as RecyclerView
        forecastlist.layoutManager = LinearLayoutManager(this)
        forecastlist.adapter = ForecastListAdapter(items)

        toast(message = "go fork yoself", length = Toast.LENGTH_LONG)
    }

    fun toast(message : String, length: Int = Toast.LENGTH_SHORT) {
            Toast.makeText(this, message, length).show()
    }
}
