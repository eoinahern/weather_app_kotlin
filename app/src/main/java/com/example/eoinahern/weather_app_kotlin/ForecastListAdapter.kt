package com.example.eoinahern.weather_app_kotlin

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by eoin_a on 18/12/2016.
 */


class ForecastListAdapter(val items : List<String>) : RecyclerView.Adapter<ForecastListAdapter.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(TextView(parent.context))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textview.text = items[position]
    }

    override fun getItemCount(): Int = items.size

    class ViewHolder(val textview: TextView) : RecyclerView.ViewHolder(textview)

}
