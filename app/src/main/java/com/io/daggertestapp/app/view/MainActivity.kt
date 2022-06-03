package com.io.daggertestapp.app.view

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.io.daggertestapp.R
import com.io.daggertestapp.app.App
import com.io.daggertestapp.domain.interactor.serial_number.GetSerialNumberUseCase
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var getSerialNumberUseCase: GetSerialNumberUseCase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        App.appComponent.inject(this)

        val text = findViewById<TextView>(R.id.tv_number)

        text.text = getSerialNumberUseCase.invoke()

        Log.e("invoke", getSerialNumberUseCase.invoke())

    }
}