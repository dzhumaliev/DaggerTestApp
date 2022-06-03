package com.io.daggertestapp

import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.filters.LargeTest
import androidx.test.runner.AndroidJUnit4
import com.io.daggertestapp.app.view.MainActivity
import com.io.daggertestapp.screen.MainScreen
import com.kaspersky.kaspresso.testcases.api.testcaserule.TestCaseRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class SimpleTest {
    @Rule
    @JvmField
    val activityTestRule = activityScenarioRule<MainActivity>()

    @get:Rule
    val testCaseRule = TestCaseRule(javaClass.simpleName)


    @Test
    fun test() = testCaseRule.run {

        step("main screen") {
            MainScreen {
                tvMain.hasAnyText()

            }
        }
    }
}