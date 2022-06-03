package com.io.daggertestapp.app

import com.io.daggertestapp.app.di.AppComponent
import com.io.daggertestapp.app.di.DaggerTestAppComponent
import com.io.daggertestapp.app.di.FakeAppModule


class TestApp : App() {

    override fun initDagger(app: App): AppComponent {
        return DaggerTestAppComponent
            .builder()
            .fakeAppModule(FakeAppModule(app))
            .build()
    }
}