package com.meadetechnologies.dagger2example

import com.meadetechnologies.dagger2example.models.Car
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Named

@PerActivity
@Subcomponent (modules = arrayOf(WheelsModule::class, PetrolEngineModule::class))
interface ActivityComponent {
    fun getCar() : Car
    fun inject(mainActivity: MainActivity)
/*
    @Subcomponent.Builder
    interface Builder {
        @BindsInstance
        fun horsePower(@Named("horse power") horsepower: Int) : Builder

        @BindsInstance
        fun engineCapacity(@Named("engine capacity") engineCapacity: Int) : Builder

        fun build() : ActivityComponent
    }*/

    @Subcomponent.Factory
    interface Factory {
        fun create(@BindsInstance @Named("horse power") horsepower: Int, @BindsInstance @Named("engine capacity") engineCapacity: Int) : ActivityComponent
    }
}