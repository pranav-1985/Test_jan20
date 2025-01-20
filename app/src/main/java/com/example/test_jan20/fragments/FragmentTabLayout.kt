package com.example.test_jan20.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.material3.Tab
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.test_jan20.R
import com.example.test_jan20.adapters.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class FragmentTabLayout : Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_tablayout, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val tabLayout=view.findViewById<TabLayout>(R.id.tabLayout)
        val viewPager=view.findViewById<ViewPager2>(R.id.viewPager)

        val tab1Fragment = TabFragment1()
        val tab2Fragment = TabFragment2()

        val adapter = ViewPagerAdapter(this)
        adapter.addFragment(tab1Fragment,"Tab-1")
        adapter.addFragment(tab2Fragment,"Tab-2")

        viewPager.adapter=adapter
        viewPager.currentItem = 0
        viewPager.offscreenPageLimit = 2

        TabLayoutMediator(tabLayout, viewPager){ tab, position ->
            tab.text = adapter.getTabTitle(position)
        }.attach()

    }

}