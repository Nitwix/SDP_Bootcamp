package com.github.nitwix.sdpbootcampkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.google.android.material.snackbar.BaseTransientBottomBar
import com.google.android.material.snackbar.Snackbar

class GreetingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greeting)

        val message = intent.getStringExtra(EXTRA_MESSAGE)

        findViewById<TextView>(R.id.nameDisplay).apply{
            text = message
        }
    }

    fun easterEgg(view : View){
        val sb = Snackbar.make(view, "Easter Egg :D", BaseTransientBottomBar.LENGTH_LONG);
        sb.show()
    }
}