package com.abunayla.swipableviewsviewpagertwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val images = listOf(
            R.drawable.cool_dog,
            R.drawable.cool_dog2,
            R.drawable.cool_dog3,
            R.drawable.cool_dog4,
            R.drawable.cool_dog5,
            R.drawable.cool_dog6,
            R.drawable.cool_dog7
        )

        val adapter = ViewPagerAdapter(images)

        vpView.adapter = adapter

        // Vertical swipes
        vpView.orientation = ViewPager2.ORIENTATION_VERTICAL

        // Horizontal swipes
        //vpView.orientation = ViewPager2.ORIENTATION_HORIZONTAL
    }
}