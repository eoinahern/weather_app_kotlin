package com.example.eoinahern.weather_app_kotlin

import android.support.v7.view.menu.MenuView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.single_string_layout.view.*

/**
 * Created by eoinahern on 16/12/2016.
 */


class ForecastAdapter(val mylist : List<String>) : RecyclerView.Adapter<ForecastAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
         val view: View = LayoutInflater.from(parent.context).inflate(R.layout.single_string_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.setup(mylist[position])
    }

    override fun getItemCount(): Int = mylist.size


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){

        fun setup( mytext : String){
            itemView.single_view.text = mytext
         }


    }

}
