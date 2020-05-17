package com.meadetechnologies.dagger2example

import com.meadetechnologies.dagger2example.models.Engine
import com.meadetechnologies.dagger2example.models.PetrolEngine
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class PetrolEngineModule {

    @Binds
    abstract fun provideEngine(engine: PetrolEngine) : Engine
}