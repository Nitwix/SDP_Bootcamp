package com.github.nitwix.sdpbootcampkotlin

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.intent.Intents
import androidx.test.espresso.intent.Intents.intended
import androidx.test.espresso.intent.matcher.IntentMatchers
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun buttonClickStartsActivity(){
        Intents.init()
        val nameWritten = "Niels Lachat";
        val textMatcher = ViewMatchers.withId(R.id.editTextTextPersonName)
        onView(textMatcher).perform(ViewActions.clearText())
        onView(textMatcher).perform(ViewActions.typeText(nameWritten))

        onView(ViewMatchers.withId(R.id.goBtn)).perform(ViewActions.click())

        intended(IntentMatchers.hasExtra(EXTRA_MESSAGE, nameWritten))


        Intents.release()
    }
}