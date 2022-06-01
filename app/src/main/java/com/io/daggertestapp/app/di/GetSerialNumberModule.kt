package com.io.daggertestapp.app.di

import com.io.daggertestapp.data.repo.GetSerialNumberRepositoryImpl
import com.io.daggertestapp.domain.interactor.serial_number.GetSerialNumberUseCase
import com.io.daggertestapp.domain.interactor.serial_number.GetSerialNumberUseCaseImpl
import com.io.daggertestapp.domain.repo.GetSerialNumberRepository
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class GetSerialNumberModule {

    @Binds
    @Singleton
    abstract fun bindGetSerialNumberUseCase(impl: GetSerialNumberUseCaseImpl): GetSerialNumberUseCase

    @Binds
    @Singleton
    abstract fun bindGetSerialNumberRepository(impl: GetSerialNumberRepositoryImpl): GetSerialNumberRepository

}