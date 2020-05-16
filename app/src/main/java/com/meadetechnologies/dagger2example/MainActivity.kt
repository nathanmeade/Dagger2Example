package com.meadetechnologies.dagger2example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.meadetechnologies.dagger2example.models.Car
import com.meadetechnologies.dagger2example.models.Engine
import com.meadetechnologies.dagger2example.models.Wheels
import dagger.Component

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val component = DaggerCarComponent.create()
        val car = component.getCar()
        car.drive()
    }
}
