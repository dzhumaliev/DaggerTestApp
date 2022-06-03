package com.io.daggertestapp.app.di

import android.app.Application
import android.content.Context
import com.io.daggertestapp.domain.interactor.serial_number.FakeGetSerialNumberUseCaseImpl
import com.io.daggertestapp.domain.interactor.serial_number.GetSerialNumberUseCase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
open class FakeAppModule(private val app: Application) {

    @Singleton
    @Provides
    fun provideContext(): Context = app

    @Provides
    @Singleton
    open fun bindGetSerialNumberUseCase(impl: FakeGetSerialNumberUseCaseImpl): GetSerialNumberUseCase =
        impl

}