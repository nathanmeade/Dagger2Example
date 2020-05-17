package com.meadetechnologies.dagger2example.models

import android.util.Log
import javax.inject.Inject

class DieselEngine
    @Inject
    constructor(val horsepower: Int) : Engine {
        val TAG = "Car"

        override fun start() {
            Log.d(TAG, "Diesel engine started. Horsepower: " + horsepower)
        }
}