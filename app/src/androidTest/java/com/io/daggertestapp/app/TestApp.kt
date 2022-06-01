package com.io.daggertestapp.app

import com.io.daggertestapp.DebugApp
import com.io.daggertestapp.di.DaggerTestAppComponent
import com.io.daggertestapp.di.TestAppComponent


class TestApp : DebugApp() {

    lateinit var fakeAppComponent: TestAppComponent

    override fun onCreate() {
        super.onCreate()

        buildDaggerTree()
    }

    private fun buildDaggerTree() {
        fakeAppComponent = DaggerTestAppComponent.builder()
            .app(this)
            .build()

        fakeAppComponent.inject(this)
    }

}