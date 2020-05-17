package com.meadetechnologies.dagger2example

import com.meadetechnologies.dagger2example.models.DieselEngine
import com.meadetechnologies.dagger2example.models.Engine
import dagger.Binds
import dagger.Module

@Module
abstract class DieselEngineModule {

    @Binds
    abstract fun provideEngine(engine: DieselEngine) : Engine
}