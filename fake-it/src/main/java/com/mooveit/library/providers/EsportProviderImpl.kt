package com.mooveit.library.providers

import com.mooveit.library.Fakeit
import com.mooveit.library.providers.base.BaseProvider
import com.mooveit.library.providers.definition.EsportProvider

class EsportProviderImpl : BaseProvider(), EsportProvider {

    override fun player(): String {
        return getValue("player") { Fakeit.fetch("esports.players") }
    }

    override fun team(): String {
        return getValue("team") { Fakeit.fetch("esports.teams") }
    }

    override fun league(): String {
        return getValue("league") { Fakeit.fetch("esports.leagues") }
    }

    override fun event(): String {
        return getValue("event") { Fakeit.fetch("esports.events") }
    }

    override fun game(): String {
        return getValue("game") { Fakeit.fetch("esports.games") }
    }
}