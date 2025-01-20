package com.example.test_jan20.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.test_jan20.R
import com.example.test_jan20.fragments.FragmentRecyclerView
import com.example.test_jan20.viewholders.MyViewHolder1

class MyAdapter(recyclerFragment: FragmentRecyclerView) : RecyclerView.Adapter<MyViewHolder1>() {

    private var mutableList = mutableListOf(
        "Mercury",
        "Venus",
        "Earth",
        "Mars",
        "Mercury",
        "Venus",
        "Earth",
        "Mars",
        "Mercury",
        "Venus",
        "Earth",
        "Mars",
        "Mercury",
        "Venus",
        "Earth",
        "Mars",
        "Mercury",
        "Venus",
        "Earth",
        "Mars",
        "Mercury",
        "Venus",
        "Earth",
        "Mars",
        "Mercury",
        "Venus",
        "Earth",
        "Mars",
        "Mercury",
        "Venus",
        "Earth",
        "Mars",
        "Mercury",
        "Venus",
        "Earth",
        "Mars",
        "Mercury",
        "Venus",
        "Earth",
    )

    private var mClickListener: ItemClickListener = recyclerFragment

    override fun getItemViewType(position: Int): Int {
        Log.e("Adapter viewType", position.toString())

        return super.getItemViewType(position)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder1 {
        Log.e("Adapter viewType", viewType.toString())
        val mContext = parent.context
        val layoutInflater = LayoutInflater.from(mContext)
        val view = layoutInflater.inflate(R.layout.recyclerview_row, parent, false)
        return MyViewHolder1(view, mClickListener)
    }

    override fun onBindViewHolder(holder: MyViewHolder1, position: Int) {
        Log.e("Adapter position", position.toString())

        val planet = mutableList[position]
        holder.myTextView.text = planet
    }

    override fun getItemCount(): Int {
        return mutableList.size
    }

    interface ItemClickListener {
        fun onItemClick(view: View?, position: Int)
    }

}
