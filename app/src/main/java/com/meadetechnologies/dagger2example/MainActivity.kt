package com.meadetechnologies.dagger2example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.meadetechnologies.dagger2example.models.Car
import com.meadetechnologies.dagger2example.models.Engine
import com.meadetechnologies.dagger2example.models.Wheels
import dagger.Component
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var car : Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val component = DaggerCarComponent.create()
        component.inject(this)
        car.drive()
    }
}
