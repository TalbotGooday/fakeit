package com.mooveit.library.providers

import com.mooveit.library.Fakeit
import com.mooveit.library.providers.base.BaseProvider
import com.mooveit.library.providers.definition.LordOfTheRingsProvider

class LordOfTheRingsProviderImpl : BaseProvider(), LordOfTheRingsProvider {

    override fun character(): String {
        return getValue("character") { Fakeit.fetch("lord_of_the_rings.characters") }
    }

    override fun location(): String {
        return getValue("location") { Fakeit.fetch("lord_of_the_rings.locations") }
    }
}