package com.io.daggertestapp.app.di

import com.io.daggertestapp.domain.interactor.serial_number.FakeGetSerialNumberUseCaseImpl
import com.io.daggertestapp.domain.interactor.serial_number.GetSerialNumberUseCase
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class FakeGetSerialNumberModule {
    @Binds
    @Singleton
    abstract fun bindGetSerialNumberUseCase(impl: FakeGetSerialNumberUseCaseImpl): GetSerialNumberUseCase

}