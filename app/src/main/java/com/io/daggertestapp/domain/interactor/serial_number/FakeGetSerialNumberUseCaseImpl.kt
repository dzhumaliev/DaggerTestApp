package com.io.daggertestapp.domain.interactor.serial_number

import javax.inject.Inject

class FakeGetSerialNumberUseCaseImpl @Inject constructor() : GetSerialNumberUseCase {
    override fun invoke(): String {
        return "FAKE SERIAL NUMBER"
    }
}