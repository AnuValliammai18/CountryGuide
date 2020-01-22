package com.example.countryguide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        view_pager2.adapter=Adapter(this)
        TabLayoutMediator(tab_layout, view_pager2,
            TabLayoutMediator.TabConfigurationStrategy { tab, position ->
                when (position) {
                    0 -> { tab.text = "Vertical"}
                    1 -> { tab.text = "Horizontal"}
                }
            }).attach()

        tab_layout.getTabAt(0)!!.setIcon(R.drawable.ic_action_vertical)
        tab_layout.getTabAt(1)!!.setIcon(R.drawable.ic_action_hori)
    }
}
