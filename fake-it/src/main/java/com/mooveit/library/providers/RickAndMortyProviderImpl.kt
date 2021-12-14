package com.mooveit.library.providers

import com.mooveit.library.Fakeit
import com.mooveit.library.providers.base.BaseProvider
import com.mooveit.library.providers.definition.RickAndMortyProvider

class RickAndMortyProviderImpl : BaseProvider(), RickAndMortyProvider {

    override fun character(): String {
        return getValue("character") { Fakeit.fetch("rick_and_morty.characters") }
    }

    override fun location(): String {
        return getValue("location") { Fakeit.fetch("rick_and_morty.locations") }
    }

    override fun quote(): String {
        return getValue("quote") { Fakeit.fetch("rick_and_morty.quotes") }
    }
}