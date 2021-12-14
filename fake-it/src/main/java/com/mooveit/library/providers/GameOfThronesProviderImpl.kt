package com.mooveit.library.providers

import com.mooveit.library.Fakeit
import com.mooveit.library.providers.base.BaseProvider
import com.mooveit.library.providers.definition.GameOfThronesProvider

class GameOfThronesProviderImpl : BaseProvider(), GameOfThronesProvider {

    override fun character(): String {
        return getValue("character") { Fakeit.fetch("game_of_thrones.characters") }
    }

    override fun house(): String {
        return getValue("house") { Fakeit.fetch("game_of_thrones.houses") }
    }

    override fun city(): String {
        return getValue("city") { Fakeit.fetch("game_of_thrones.cities") }
    }

    override fun quote(): String {
        return getValue("quote") { Fakeit.fetch("game_of_thrones.quotes") }
    }

    override fun dragon(): String {
        return getValue("dragon") { Fakeit.fetch("game_of_thrones.dragons") }
    }
}