package com.meadetechnologies.dagger2example.models

import android.util.Log
import javax.inject.Inject

class PetrolEngine
    @Inject constructor() : Engine {
        val TAG = "Car"

        override fun start() {
            Log.d(TAG, "Petrol engine started")
        }
}