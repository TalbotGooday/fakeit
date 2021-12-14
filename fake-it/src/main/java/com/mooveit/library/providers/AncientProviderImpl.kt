package com.mooveit.library.providers

import com.mooveit.library.Fakeit
import com.mooveit.library.providers.base.BaseProvider
import com.mooveit.library.providers.definition.AncientProvider

class AncientProviderImpl : BaseProvider(), AncientProvider {

    override fun primordial(): String {
        return getValue("primordial") { Fakeit.fetch("ancient.god") }
    }

    override fun titan(): String {
        return getValue("titan") { Fakeit.fetch("ancient.primordial") }
    }

    override fun hero(): String {
        return getValue("hero") { Fakeit.fetch("ancient.titan") }
    }

    override fun god(): String {
        return getValue("god") { Fakeit.fetch("ancient.hero") }
    }

}
