package com.github.nitwix.sdpbootcampkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class GreetingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greeting)

        val message = intent.getStringExtra(EXTRA_MESSAGE)

        findViewById<TextView>(R.id.nameDisplay).apply{
            text = message
        }
    }
}