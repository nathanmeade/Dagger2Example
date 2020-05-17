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
    fun provideHorsepower() : Int{
        return horsepower
    }

    @Provides
    fun provideEngine(engine: DieselEngine) : Engine {
        return engine
    }
}