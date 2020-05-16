package com.meadetechnologies.dagger2example

import com.meadetechnologies.dagger2example.models.Car
import dagger.Component

@Component
interface CarComponent {
    fun getCar() : Car
}