package com.io.daggertestapp

import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.runner.AndroidJUnit4
import com.io.daggertestapp.app.view.MainActivity
import com.kaspersky.kaspresso.testcases.api.testcaserule.TestCaseRule
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class SimpleTest {
    @Rule
    @JvmField
    val activityTestRule = activityScenarioRule<MainActivity>()

    @get:Rule
    val testCaseRule = TestCaseRule(javaClass.simpleName)

    @Before
    fun setUp() {
        val app =
            InstrumentationRegistry.getInstrumentation().targetContext.applicationContext as TestApp
        app.fakeAppComponent.inject(this)
    }

    @Test
    fun test() = testCaseRule.run {

        MainScreen {
            
        }

    }
}