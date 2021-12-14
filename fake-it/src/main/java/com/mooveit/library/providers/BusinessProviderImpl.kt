package com.mooveit.library.providers

import com.mooveit.library.Fakeit
import com.mooveit.library.providers.base.BaseProvider
import com.mooveit.library.providers.definition.BusinessProvider

class BusinessProviderImpl : BaseProvider(), BusinessProvider {

    override fun name(): String {
        return getValue("name") { Fakeit.fetch("commerce.product_name.product") }
    }

    override fun type(): String {
        return getValue("type") { Fakeit.fetch("commerce.department") }
    }

    override fun subType(): String {
        return getValue("subType") { Fakeit.fetch("commerce.department") }
    }
}

