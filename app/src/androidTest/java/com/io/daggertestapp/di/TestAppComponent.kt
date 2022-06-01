package com.io.daggertestapp.di

import android.app.Application
import com.io.daggertestapp.SimpleTest
import com.io.daggertestapp.app.TestApp
import com.io.daggertestapp.app.di.AppComponent
import com.io.daggertestapp.app.di.FakeGetSerialNumberModule
import com.io.daggertestapp.app.view.MainActivity
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        FakeGetSerialNumberModule::class
    ]
)
interface TestAppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun app(application: Application): Builder

        fun build(): TestAppComponent

    }

    fun inject(app: TestApp)

    fun inject(simpleTest: SimpleTest)

    fun inject(main: MainActivity)

}