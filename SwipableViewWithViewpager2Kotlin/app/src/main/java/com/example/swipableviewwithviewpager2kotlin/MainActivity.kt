package com.example.swipableviewwithviewpager2kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main.*

//We  learn how to create swipable views using the new viewpager2.
// Source: https://www.youtube.com/watch?v=-wB_JE_PRTo&list=PLQkwcJG4YTCTq1raTb5iMuxnEB06J1VHX&index=24
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val images = listOf(
            R.drawable.image1, R.drawable.image2, R.drawable.image3,
            R.drawable.image4, R.drawable.image5, R.drawable.image6 )

        // Create an instance of ViewPagerAdapter
        val adapter = ViewPagerAdapter(images)

        // add the adapter to viewpager
        viewPager.adapter = adapter  // this default viewPager will swipe horizontally

        // If we want to swipe vertically
        viewPager.orientation = ViewPager2.ORIENTATION_VERTICAL


        // for fake drag
        viewPager.beginFakeDrag()
        viewPager.fakeDragBy(-10f)
        viewPager.endFakeDrag()

    }
}