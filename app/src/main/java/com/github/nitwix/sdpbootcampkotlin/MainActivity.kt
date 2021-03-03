package com.github.nitwix.sdpbootcampkotlin

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

const val EXTRA_MESSAGE = "com.github.nitwix.sdpbootcampkotlin.MESSAGE"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun startGreeting(view: View){
        val text: EditText = findViewById(R.id.editTextTextPersonName);
        val name = text.text.toString()
        val intent = Intent(this, GreetingActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, name)
        }
        startActivity(intent)
    }
}