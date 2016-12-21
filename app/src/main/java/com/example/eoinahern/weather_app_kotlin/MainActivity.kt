package com.example.eoinahern.weather_app_kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.*
import org.jetbrains.anko.doAsync

import org.jetbrains.anko.custom.async
import java.util.concurrent.Executors

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

        //val forecastlist : RecyclerView = find(R.id.forecast_list)
        //forecastlist.layoutManager = LinearLayoutManager(this)
        //forecastlist.adapter = ForecastListAdapter(items)


        val APP_ID = "15646a06818f61f7b8d7823ca833e1ce"
        val URL = "http://api.openweathermap.org/data/2.5/forecast/daily?mode=json&units=metric&cnt=7"
        val COMPLETE_URL = "$URL&APPID=$APP_ID&q="


        async() {
            Request(COMPLETE_URL + "94101").run()  //using hard coded zip code
            uiThread { longToast("Request performed") }
        }

    }

}
