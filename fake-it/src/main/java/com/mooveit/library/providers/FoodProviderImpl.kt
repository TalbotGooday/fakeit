package com.mooveit.library.providers

import com.mooveit.library.Fakeit
import com.mooveit.library.providers.base.BaseProvider
import com.mooveit.library.providers.definition.FoodProvider

class FoodProviderImpl : BaseProvider(), FoodProvider {

    override fun ingredient(): String {
        return getValue("ingredient") { Fakeit.fetch("food.ingredients") }
    }

    override fun spice(): String {
        return getValue("spice") { Fakeit.fetch("food.spices") }
    }

    override fun measurement(): String {
        return getValue("measurement") {
            Fakeit.fetch("food.measurement_sizes") + " " + Fakeit.fetch(
                "food.measurements"
            )
        }
    }
}