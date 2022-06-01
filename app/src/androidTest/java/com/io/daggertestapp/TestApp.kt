package com.io.daggertestapp


class TestApp : DebugApp() {

    lateinit var fakeAppComponent: TestAppComponent

    override fun onCreate() {
        super.onCreate()

        buildDaggerTree()
    }

    private fun buildDaggerTree() {
        fakeAppComponent = DaggerTestAppComponent.builder()
            .app(this)
            .build()

        fakeAppComponent.inject(this)
    }

}