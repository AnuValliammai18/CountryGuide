package com.example.countryguide


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.accessibility.AccessibilityNodeInfo
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.vertical_display.*



/**
 * A simple [Fragment] subclass.
 */
class VerticalFragment : Fragment() {
    lateinit var countryList:MutableList<CountryItem>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var v=inflater.inflate(R.layout.vertical_display,container,false)

       return v
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var viewAdapter = RecyclerViewAdapter(context,countryList)
        ver_recyclerview.apply {
            adapter = viewAdapter
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        countryList= mutableListOf(CountryItem(R.drawable.chile,"Chile"),
            CountryItem(R.drawable.india,"India"), CountryItem(R.drawable.malaysia,"Malaysia"),
            CountryItem(R.drawable.uk,"UK"),CountryItem(R.drawable.us,"US"))
    }
}

