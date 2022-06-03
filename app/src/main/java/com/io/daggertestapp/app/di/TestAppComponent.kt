package com.io.daggertestapp.app.di

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        FakeAppModule::class
    ]
)
interface TestAppComponent : AppComponent