package com.io.daggertestapp

import com.io.daggertestapp.app.App


class TestApp : App() {

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