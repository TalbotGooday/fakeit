package com.mooveit.library.providers

import com.mooveit.library.Fakeit
import com.mooveit.library.providers.base.BaseProvider
import com.mooveit.library.providers.definition.CardProvider

class CardProviderImpl : BaseProvider(), CardProvider {

    override fun name(): String {
        return getValue("name") { Fakeit.fetch("name.name") }
    }

    override fun brand(): String {
        return getValue("name") { Fakeit.fetch("business.credit_card_types") }
    }

    override fun number(): String {
        return getValue("name") { Fakeit.fetch("credit_card.visa") }
    }

    override fun type(): String {
        return getValue("name") { Fakeit.fetch("business.credit_card_types") }
    }

    override fun expirationDate(): String {
        return getValue("name") { Fakeit.fetch("business.credit_card_expiry_dates") }
    }
}
