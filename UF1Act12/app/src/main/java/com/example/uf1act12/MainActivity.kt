package com.example.uf1act12

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.HorizontalScrollView
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {

    private lateinit var horizontalScrollView: HorizontalScrollView
    private lateinit var toggleScroll: ToggleButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        horizontalScrollView = findViewById(R.id.horizontalScrollView)
        toggleScroll = findViewById(R.id.toggleScroll)


        toggleScroll.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                horizontalScrollView.isVerticalScrollBarEnabled = false
                horizontalScrollView.isHorizontalScrollBarEnabled = false
            } else {
                horizontalScrollView.isVerticalScrollBarEnabled = true
                horizontalScrollView.isHorizontalScrollBarEnabled = true
            }
        }





    }
}