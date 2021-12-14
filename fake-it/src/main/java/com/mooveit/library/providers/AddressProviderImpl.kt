package com.mooveit.library.providers

import com.mooveit.library.Fakeit
import com.mooveit.library.providers.base.BaseProvider
import com.mooveit.library.providers.definition.AddressProvider

class AddressProviderImpl : BaseProvider(), AddressProvider {

    override fun city(): String {
        return getValue("city") { Fakeit.fetch("address.city") }
    }

    override fun streetAddress(): String {
        return getValue("streetAddress") { Fakeit.fetch("address.street_address") }
    }

    override fun buildingNumber(): String {
        return getValue("buildingNumber") { Fakeit.fetch("address.secondary_address") }
    }

    override fun zipCode(): String {
        return getValue("zipCode") { Fakeit.fetch("address.zip_code") }
    }

    override fun state(): String {
        return getValue("state") { Fakeit.fetch("address.state") }
    }

    override fun stateAbbreviation(): String {
        return getValue("stateAbbreviation") { Fakeit.fetch("address.state_abbr") }
    }
}