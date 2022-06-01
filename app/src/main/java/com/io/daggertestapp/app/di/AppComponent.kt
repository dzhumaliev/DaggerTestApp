package com.io.daggertestapp.app.di

import android.app.Application
import com.io.daggertestapp.app.App
import com.io.daggertestapp.app.view.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        GetSerialNumberModule::class
    ]
)
interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun app(application: Application): Builder

        fun build(): AppComponent

    }

    fun inject(app: App)


    fun inject(main: MainActivity)

}