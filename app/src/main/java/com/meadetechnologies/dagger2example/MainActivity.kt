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
    lateinit var car1 : Car; @Inject lateinit var car2 : Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val component = DaggerCarComponent.builder().horsePower(150).engineCapacity(1400).build()
        component.inject(this)
        car1.drive()
        car2.drive()
    }
}
