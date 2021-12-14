package com.mooveit.library.providers

import com.mooveit.library.Fakeit
import com.mooveit.library.providers.base.BaseProvider
import com.mooveit.library.providers.definition.CatProvider

class CatProviderImpl : BaseProvider(), CatProvider {

    override fun name(): String {
        return getValue("name") { Fakeit.fetch("cat.name") }
    }

    override fun breed(): String {
        return getValue("name") { Fakeit.fetch("cat.breed") }
    }

    override fun registry(): String {
        return getValue("name") { Fakeit.fetch("cat.registry") }
    }
}