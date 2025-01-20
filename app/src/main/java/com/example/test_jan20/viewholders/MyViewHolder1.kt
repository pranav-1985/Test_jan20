package com.example.test_jan20.viewholders

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.test_jan20.R
import com.example.test_jan20.adapters.MyAdapter

class MyViewHolder1(itemView: View, mClickListener: MyAdapter.ItemClickListener) : RecyclerView.ViewHolder(itemView) {
    var myTextView: TextView = itemView.findViewById<TextView>(R.id.textView)

    init {
        itemView.setOnClickListener { view ->
            mClickListener.onItemClick(view, adapterPosition)
        }
    }
}