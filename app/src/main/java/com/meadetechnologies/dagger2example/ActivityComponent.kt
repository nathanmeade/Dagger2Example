package com.meadetechnologies.dagger2example

import com.meadetechnologies.dagger2example.models.Car
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Named

@PerActivity
@Subcomponent (modules = arrayOf(WheelsModule::class, DieselEngineModule::class))
interface ActivityComponent {
    fun getCar() : Car
    fun inject(mainActivity: MainActivity)

/*    @Component.Builder
    interface Builder {
        @BindsInstance
        fun horsePower(@Named("horse power") horsepower: Int) : Builder

        @BindsInstance
        fun engineCapacity(@Named("engine capacity") engineCapacity: Int) : Builder

        fun appComponent(component: AppComponent) : Builder

        fun build() : ActivityComponent
    }*/
}