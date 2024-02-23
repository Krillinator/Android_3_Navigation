package com.example.lektion_3_navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        // components
        val tvAbout: TextView = findViewById(R.id.tv_about)

        // Set text
        tvAbout.text = intent.getStringExtra("message")

    }
}