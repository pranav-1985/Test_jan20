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

    private var mutableList: MutableList<String> = mutableListOf(
        "Alpha", "Beta", "Gamma", "Delta", "Epsilon", "Zeta", "Eta", "Theta",
        "Iota", "Kappa", "Lambda", "Mu", "Nu", "Xi", "Omicron", "Pi", "Rho",
        "Sigma", "Tau", "Upsilon", "Phi", "Chi", "Psi", "Omega"
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

        val strings = mutableList[position]
        holder.myTextView.text = strings
    }

    override fun getItemCount(): Int {
        return mutableList.size
    }

    interface ItemClickListener {
        fun onItemClick(view: View?, position: Int)
    }

}
