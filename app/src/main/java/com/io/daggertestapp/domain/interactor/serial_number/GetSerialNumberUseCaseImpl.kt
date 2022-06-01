package com.io.daggertestapp.domain.interactor.serial_number

import com.io.daggertestapp.domain.repo.GetSerialNumberRepository
import javax.inject.Inject

class GetSerialNumberUseCaseImpl @Inject constructor(
    private val getSerialNumberRepository: GetSerialNumberRepository
) : GetSerialNumberUseCase {
    override fun invoke(): String {
        return getSerialNumberRepository.getSerialNumber()
    }
}