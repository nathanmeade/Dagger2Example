package com.meadetechnologies.dagger2example.models

import android.util.Log
import javax.inject.Inject


class Car
    @Inject
    constructor(private val wheels: Wheels)  {
        val TAG = "Car"

        @Inject lateinit var engine : Engine

        @Inject
        fun enableRemote(remote: Remote){
            remote.setListener(this)
        }

        fun drive() {
            Log.d(TAG, "driving...")
        }
    }