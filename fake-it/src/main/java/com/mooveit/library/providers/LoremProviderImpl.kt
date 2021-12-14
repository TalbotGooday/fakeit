package com.mooveit.library.providers

import com.mooveit.library.Fakeit
import com.mooveit.library.providers.base.BaseProvider
import com.mooveit.library.providers.definition.LoremProvider

class LoremProviderImpl : BaseProvider(), LoremProvider {

    override fun words(): String {
        return getValue("words") { Fakeit.fetch("lorem.words") }
    }

    override fun supplemental(): String {
        return getValue("supplemental") { Fakeit.fetch("lorem.supplemental") }
    }
}