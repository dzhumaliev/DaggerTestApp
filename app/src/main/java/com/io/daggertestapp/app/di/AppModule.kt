package com.io.daggertestapp.app.di

import android.app.Application
import android.content.Context
import com.io.daggertestapp.data.repo.GetSerialNumberRepositoryImpl
import com.io.daggertestapp.domain.interactor.serial_number.GetSerialNumberUseCase
import com.io.daggertestapp.domain.interactor.serial_number.GetSerialNumberUseCaseImpl
import com.io.daggertestapp.domain.repo.GetSerialNumberRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
open class AppModule(private val app: Application) {

    @Singleton
    @Provides
    fun provideContext(): Context = app

    @Provides
    @Singleton
    fun bindGetSerialNumberUseCase(impl: GetSerialNumberUseCaseImpl): GetSerialNumberUseCase = impl

    @Provides
    @Singleton
    fun bindGetSerialNumberRepository(impl: GetSerialNumberRepositoryImpl): GetSerialNumberRepository =
        impl

}