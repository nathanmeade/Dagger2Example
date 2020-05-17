package com.meadetechnologies.dagger2example.models

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class PetrolEngine
    @Inject constructor(@Named("horse power") val horsepower: Int, @Named("engine capacity") val engineCapacity: Int) : Engine {
        val TAG = "Car"

        override fun start() {
            Log.d(TAG, "Petrol engine started. Horsepower: " + horsepower + ", engine capacity: " + engineCapacity)
        }
}