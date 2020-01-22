package com.example.countryguide

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.custom_row_layout.view.*

class RecyclerViewAdapter(var context:Context?,var myDataSet:MutableList<CountryItem>):RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>()
{
    class ViewHolder(view: View):RecyclerView.ViewHolder(view)
    {
            var flag = view.flag
            var name = view.name
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
     val view=LayoutInflater.from(context)
         .inflate(R.layout.custom_row_layout, parent, false)
        return ViewHolder(view)
    }
    override fun getItemCount()=myDataSet.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.text=myDataSet[position].cname
        holder.flag.setImageResource(myDataSet[position].cflag)
    }
}