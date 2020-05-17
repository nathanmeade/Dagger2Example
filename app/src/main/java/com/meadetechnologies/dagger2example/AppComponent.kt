package com.meadetechnologies.dagger2example

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(DriverModule::class))
interface AppComponent {

    fun getActivityComponent(dieselEngineModule: DieselEngineModule) : ActivityComponent
}