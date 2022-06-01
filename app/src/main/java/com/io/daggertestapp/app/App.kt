package com.io.daggertestapp.app

import android.app.Application
import com.io.daggertestapp.app.di.AppComponent
import com.io.daggertestapp.app.di.DaggerAppComponent

open class App : Application() {

    companion object {
        lateinit var appComponent: AppComponent

    }

    override fun onCreate() {
        super.onCreate()
        buildDaggerTree()

    }

    private fun buildDaggerTree() {
        appComponent = DaggerAppComponent.builder()
            .app(this)
            .build()
        appComponent.inject(this)
    }
}