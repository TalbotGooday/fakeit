package com.mooveit.library.providers

import com.mooveit.library.Fakeit
import com.mooveit.library.providers.base.BaseProvider
import com.mooveit.library.providers.definition.HarryPotterProvider

class HarryPotterProviderImpl : BaseProvider(), HarryPotterProvider {

    override fun character(): String {
        return getValue("character") { Fakeit.fetch("harry_potter.characters") }
    }

    override fun location(): String {
        return getValue("location") { Fakeit.fetch("harry_potter.locations") }
    }

    override fun quote(): String {
        return getValue("quote") { Fakeit.fetch("harry_potter.quotes") }
    }

    override fun book(): String {
        return getValue("book") { Fakeit.fetch("harry_potter.books") }
    }
}