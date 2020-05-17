package com.meadetechnologies.dagger2example

import android.app.Application

class ExampleApp : Application() {
    private lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()
        component = DaggerAppComponent.create()

    }

    fun getAppComponent() : AppComponent {
        return component
    }
}