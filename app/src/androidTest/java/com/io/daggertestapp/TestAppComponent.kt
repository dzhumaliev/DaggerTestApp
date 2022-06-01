package com.io.daggertestapp

import android.app.Application
import com.io.daggertestapp.app.di.AppComponent
import com.io.daggertestapp.app.di.FakeGetSerialNumberModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        FakeGetSerialNumberModule::class
    ]
)
interface TestAppComponent : AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun app(application: Application): Builder

        fun build(): TestAppComponent

    }

    fun inject(app: TestApp)

    fun inject(simpleTest: SimpleTest)

}