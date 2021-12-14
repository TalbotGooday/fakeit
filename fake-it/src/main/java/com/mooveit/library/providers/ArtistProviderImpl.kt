package com.mooveit.library.providers

import com.mooveit.library.Fakeit
import com.mooveit.library.providers.base.BaseProvider
import com.mooveit.library.providers.definition.ArtistProvider

class ArtistProviderImpl : BaseProvider(), ArtistProvider {

    override fun name(): String {
        return getValue("name") { Fakeit.fetch("artist.names") }
    }
}