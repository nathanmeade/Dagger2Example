package com.meadetechnologies.dagger2example.models

import com.meadetechnologies.dagger2example.Rims
import com.meadetechnologies.dagger2example.Tires
import javax.inject.Inject

class Wheels
    @Inject
    constructor(
        tires: Tires,
        rims: Rims
    ) {
}
