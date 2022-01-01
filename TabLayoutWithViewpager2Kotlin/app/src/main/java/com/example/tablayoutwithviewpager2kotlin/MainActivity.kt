package com.example.tablayoutwithviewpager2kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val images = listOf(
            R.drawable.image1, R.drawable.image2, R.drawable.image3,
            R.drawable.image4, R.drawable.image5, R.drawable.image6, R.drawable.image7 )

        // Create an instance of ViewPagerAdapter
        val adapter = ViewPagerAdapter(images)

        // add the adapter to viewpager
        viewPager.adapter = adapter

        // For SwappableTabLayout
        TabLayoutMediator(tabLayout, viewPager){tab, position ->
            tab.text = "Tab ${position + 1}"
        }.attach()

        // Do something For selecting each tab
        tabLayout.addOnTabSelectedListener(object  : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                Toast.makeText(this@MainActivity, "Selected ${tab?.text}",Toast.LENGTH_SHORT).show()

            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                Toast.makeText(this@MainActivity, "Unselected ${tab?.text}",Toast.LENGTH_SHORT).show()
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
                Toast.makeText(this@MainActivity, "Reselected ${tab?.text}",Toast.LENGTH_SHORT).show()
            }

        })

    }
}