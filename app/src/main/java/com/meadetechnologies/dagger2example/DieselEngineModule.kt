package com.meadetechnologies.dagger2example

import com.meadetechnologies.dagger2example.models.DieselEngine
import com.meadetechnologies.dagger2example.models.Engine
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule
    constructor(private val horsepower: Int) {

    @Provides
    fun provideEngine() : Engine {
        return DieselEngine(horsepower)
    }
}