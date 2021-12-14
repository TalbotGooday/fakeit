package com.mooveit.library.providers

import com.mooveit.library.Fakeit
import com.mooveit.library.providers.base.BaseProvider
import com.mooveit.library.providers.definition.CoffeeProvider
import java.util.*

class CoffeeProviderImpl : BaseProvider(), CoffeeProvider {

    override fun blendName(): String = getValue("blend_name") { Fakeit.fetch("coffee.blend_name") }

    override fun origin(): String {
        val country = getValue("country") { Fakeit.fetch("coffee.country") }
        val countryFormatted = country.replace(" ", "_").lowercase(Locale.getDefault())
        return country + ", " + getValue("regions") { Fakeit.fetch("coffee.regions.$countryFormatted") }
    }

    override fun variety(): String = getValue("variety") { Fakeit.fetch("coffee.variety") }

    override fun notes(): String = getValue("notes") { Fakeit.fetch("coffee.notes") }
}