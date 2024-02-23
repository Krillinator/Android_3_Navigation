package com.example.lektion_3_navigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Components
        val btnSetUsername: Button = findViewById(R.id.btn_setUsername)
        val btnNavigate: Button = findViewById(R.id.btn_navigate)
        val tvGreeting: TextView = findViewById(R.id.tv_greeting)
        val etUsername: EditText = findViewById(R.id.et_username)   // Input

        // Navigate
        btnNavigate.setOnClickListener {

            val myIntent = Intent(this, AboutActivity::class.java).apply {
                putExtra("message", "Hello Bananas")
            }

            startActivity(myIntent)
        }

        // Set Username
        btnSetUsername.setOnClickListener {
            tvGreeting.text = etUsername.text
        }

    }
}