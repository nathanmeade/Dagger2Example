package com.meadetechnologies.dagger2example

import com.meadetechnologies.dagger2example.models.Car
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Component (modules = arrayOf(WheelsModule::class, PetrolEngineModule::class))
interface CarComponent {
    fun getCar() : Car
    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun horsePower(@Named("horse power") horsepower: Int) : Builder

        @BindsInstance
        fun engineCapacity(@Named("engine capacity") engineCapacity: Int) : Builder

        fun build() : CarComponent
    }
}