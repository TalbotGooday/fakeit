package com.mooveit.library.providers

import com.mooveit.library.Fakeit
import com.mooveit.library.providers.base.BaseProvider
import com.mooveit.library.providers.definition.PokemonProvider

class PokemonProviderImpl : BaseProvider(), PokemonProvider {

    override fun name(): String {
        return getValue("name") { Fakeit.fetch("pokemon.names") }
    }

    override fun location(): String {
        return getValue("location") { Fakeit.fetch("pokemon.locations") }
    }
}