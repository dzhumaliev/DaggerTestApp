package com.io.daggertestapp

import com.io.daggertestapp.app.view.MainActivity
import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.text.KTextView

object MainScreen : KScreen<MainScreen>() {
    override val layoutId: Int = R.layout.activity_main
    override val viewClass: Class<*> = MainActivity::class.java


    val tvMain = KTextView { withId(R.id.tv_number) }


}