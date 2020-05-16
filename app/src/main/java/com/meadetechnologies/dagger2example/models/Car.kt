package com.meadetechnologies.dagger2example.models

import android.util.Log
import javax.inject.Inject


class Car
    @Inject
    constructor(private val engine: Engine, private val wheels: Wheels)  {
        val TAG = "Car"

        @Inject
        fun enableRemote(remote: Remote){
            remote.setListener(this)
        }

        fun drive() {
            Log.d(TAG, "driving...")
        }
    }