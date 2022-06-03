package com.io.daggertestapp.data.repo

import com.io.daggertestapp.domain.repo.GetSerialNumberRepository
import javax.inject.Inject

class GetSerialNumberRepositoryImpl @Inject constructor() : GetSerialNumberRepository {

    override fun getSerialNumber(): String {
        return "REAL SERIAL NUMBER"
    }
}