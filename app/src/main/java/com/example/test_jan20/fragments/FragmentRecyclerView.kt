package com.example.test_jan20.fragments

import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.test_jan20.R
import com.example.test_jan20.adapters.MyAdapter

class FragmentRecyclerView : Fragment(), MyAdapter.ItemClickListener {

    private lateinit var mRecyclerView: RecyclerView
    private var mAdapter: MyAdapter = MyAdapter(this)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_recyclerview, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mRecyclerView= view.findViewById(R.id.recyclerview)

        mRecyclerView.layoutManager=LinearLayoutManager(context, RecyclerView.VERTICAL,false)

        mRecyclerView.adapter = mAdapter
    }

    override fun onItemClick(view: View?, position: Int) {
        //Log.e( "onItemClick: clicked an item at  "+position, view.toString() )
    }
}