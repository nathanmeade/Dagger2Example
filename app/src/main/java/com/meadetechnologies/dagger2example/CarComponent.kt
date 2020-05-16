package com.meadetechnologies.dagger2example

import com.meadetechnologies.dagger2example.models.Car
import dagger.Component
import dagger.Module

@Component (modules = arrayOf(WheelsModule::class))
interface CarComponent {
    fun getCar() : Car
    fun inject(mainActivity: MainActivity)
}