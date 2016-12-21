package com.example.eoinahern.weather_app_kotlin

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by eoinahern on 16/12/2016.
 */


class ForecastAdapter(val mylist : List<String>) : RecyclerView.Adapter<ForecastAdapter.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(TextView(parent.context))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.textView.text = mylist[position]
    }

    override fun getItemCount(): Int = mylist.size


    class ViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)

}
