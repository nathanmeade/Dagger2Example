package com.meadetechnologies.dagger2example

import com.meadetechnologies.dagger2example.models.Wheels
import dagger.Module
import dagger.Provides

@Module
class WheelsModule {
    @Provides
    fun getTires() : Tires {
        val tires = Tires()
        tires.inflate()
        return tires
    }

    @Provides
    fun getRims() : Rims {
        val rims = Rims()
        return rims
    }

    @Provides
    fun getWheels(tires: Tires, rims: Rims) : Wheels {
        return Wheels(tires, rims)
    }
}