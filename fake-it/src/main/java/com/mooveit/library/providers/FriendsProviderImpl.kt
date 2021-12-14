package com.mooveit.library.providers

import com.mooveit.library.Fakeit
import com.mooveit.library.providers.base.BaseProvider
import com.mooveit.library.providers.definition.FriendsProvider

class FriendsProviderImpl : BaseProvider(), FriendsProvider {

    override fun character(): String {
        return getValue("character") { Fakeit.fetch("friends.characters") }
    }

    override fun location(): String {
        return getValue("location") { Fakeit.fetch("friends.locations") }
    }

    override fun quote(): String {
        return getValue("quote") { Fakeit.fetch("friends.quotes") }
    }
}

