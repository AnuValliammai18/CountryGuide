package com.example.countryguide

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter

class Adapter(fa: FragmentActivity) :FragmentStateAdapter(fa) {

    override fun getItemCount()=2

    override fun createFragment(position: Int): Fragment {
        return if (position == 0)
            VerticalFragment()
        else
            HorizontalFragment()
    }
}