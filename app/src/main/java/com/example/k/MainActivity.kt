package com.example.k


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.k.adapter.OnBoardingViewPagerAdapter
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    var onBoardingViewPagerAdapter: OnBoardingViewPagerAdapter?=null
    var tabLayout: TabLayout? = null
    var onBoardingViewPager: ViewPager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tabLayout = findViewById(R.id.tab_indicator)


        val onBoardingData:MutableList<OnBoardingData> = ArrayList()
        onBoardingData.add(OnBoardingData("Welcome to United Grooves !","United Grooves School of dance is a dance studio with a space of 1100sq.ft and Air conditioned,which is located in Anna nagar,one of the most busiest place in chennai.",R.drawable.g1))
                onBoardingData.add(OnBoardingData("Why Choose Us","",R.drawable.g2))
        setOnbOnBoardingViewPagerAdapter(onBoardingData)
    }
    private fun setOnbOnBoardingViewPagerAdapter(onBoardingData: List<OnBoardingData>){
        onBoardingViewPager = findViewById(R.id.screenPager);
        onBoardingViewPagerAdapter = OnBoardingViewPagerAdapter(this,onBoardingData)
        onBoardingViewPager!!.adapter = onBoardingViewPagerAdapter
        tabLayout?.setupWithViewPager(onBoardingViewPager)

    }
}