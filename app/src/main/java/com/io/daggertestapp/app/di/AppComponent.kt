package com.io.daggertestapp.app.di

import com.io.daggertestapp.app.App
import com.io.daggertestapp.app.TestApp
import com.io.daggertestapp.app.view.MainActivity
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class
    ]
)
interface AppComponent {

    fun inject(app: App)

    fun inject(app: TestApp)

    fun inject(main: MainActivity)

}