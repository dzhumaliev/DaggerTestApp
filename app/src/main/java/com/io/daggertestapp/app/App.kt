package com.io.daggertestapp.app

import android.app.Application
import com.io.daggertestapp.app.di.AppComponent
import com.io.daggertestapp.app.di.AppModule
import com.io.daggertestapp.app.di.DaggerAppComponent

open class App : Application() {

    companion object {
        lateinit var appComponent: AppComponent

    }

    protected open fun initDagger(app: App): AppComponent {
        return DaggerAppComponent
            .builder()
            .appModule(AppModule(app))
            .build()

    }

    override fun onCreate() {
        super.onCreate()

        appComponent = initDagger(this)

        appComponent.inject(this)
    }
}