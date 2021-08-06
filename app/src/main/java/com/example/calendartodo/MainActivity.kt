package com.example.calendartodo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        getSupportActionBar()?.hide();
        calendarView.setOnDateChangeListener { view, year, month, dayOfMonth ->
            textView2.text = "$dayOfMonth.${month + 1}.$year"


        }






        PagerfPush.adapter = ViewPagerAdapter()

    }
}

