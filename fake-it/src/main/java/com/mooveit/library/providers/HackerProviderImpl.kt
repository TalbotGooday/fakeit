package com.mooveit.library.providers

import com.mooveit.library.Fakeit
import com.mooveit.library.providers.base.BaseProvider
import com.mooveit.library.providers.definition.HackerProvider

class HackerProviderImpl : BaseProvider(), HackerProvider {

    override fun abbreviation(): String {
        return getValue("abbreviation") { Fakeit.fetch("hacker.abbreviation") }
    }

    override fun adjective(): String {
        return getValue("adjective") { Fakeit.fetch("hacker.adjective") }
    }

    override fun noun(): String {
        return getValue("noun") { Fakeit.fetch("hacker.noun") }
    }

    override fun verb(): String {
        return getValue("verb") { Fakeit.fetch("hacker.verb") }
    }

    override fun ingverb(): String {
        return getValue("ingverb") { Fakeit.fetch("hacker.ingverb") }
    }
}