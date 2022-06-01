package com.io.daggertestapp

import android.util.Log
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.filters.LargeTest
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.runner.AndroidJUnit4
import com.io.daggertestapp.app.TestApp
import com.io.daggertestapp.app.view.MainActivity
import com.io.daggertestapp.domain.interactor.serial_number.GetSerialNumberUseCase
import com.io.daggertestapp.screen.MainScreen
import com.kaspersky.kaspresso.testcases.api.testcaserule.TestCaseRule
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import javax.inject.Inject

@LargeTest
@RunWith(AndroidJUnit4::class)
class SimpleTest {
    @Rule
    @JvmField
    val activityTestRule = activityScenarioRule<MainActivity>()

    @get:Rule
    val testCaseRule = TestCaseRule(javaClass.simpleName)

    @Inject
    lateinit var getSerialNumberUseCase: GetSerialNumberUseCase

    @Before
    fun setUp() {
        val app =
            InstrumentationRegistry.getInstrumentation().targetContext.applicationContext as TestApp
        app.fakeAppComponent.inject(this)
    }

    @Test
    fun test() = testCaseRule.run {

        step("main screen") {
            MainScreen {

            }

            Log.e("serial", getSerialNumberUseCase.invoke())


        }
    }
}