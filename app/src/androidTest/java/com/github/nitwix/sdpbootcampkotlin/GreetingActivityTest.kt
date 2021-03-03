package com.github.nitwix.sdpbootcampkotlin

import android.content.Intent
import android.widget.EditText
import android.widget.TextView
import androidx.test.core.app.ActivityScenario
import androidx.test.core.app.ApplicationProvider
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewAssertion
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class GreetingActivityTest {
    @Test
    fun testNameDisplay(){
        val nameToDisplay = "Bruh"
        val intent = Intent(ApplicationProvider.getApplicationContext(),
                GreetingActivity::class.java).apply{
            putExtra(EXTRA_MESSAGE, nameToDisplay)
        }
        val scen = ActivityScenario.launch<GreetingActivity>(intent)
        try{
            onView(ViewMatchers.withId(R.id.nameDisplay))
                    .check(ViewAssertions.matches(ViewMatchers.withText(nameToDisplay)))
        }finally {
            scen.close()
        }
    }
}