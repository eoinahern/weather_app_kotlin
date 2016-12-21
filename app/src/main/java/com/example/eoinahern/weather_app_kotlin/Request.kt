package com.example.eoinahern.weather_app_kotlin

import android.util.Log
import java.net.URL

/**
 * Created by eoinahern on 21/12/2016.
 */


class Request(val url : String){

    fun run() {
        val forecastjsonstr = URL(url).readText()
        Log.d(javaClass.simpleName, forecastjsonstr)
    }
}
