package com.meadetechnologies.dagger2example

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DriverModule
    constructor(private val driveName: String){

    @Provides
    @Singleton
    fun provideDriver() : Driver {
        return Driver(driveName)
    }
}