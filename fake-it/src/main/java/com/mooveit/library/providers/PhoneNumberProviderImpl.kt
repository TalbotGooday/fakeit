package com.mooveit.library.providers

import com.mooveit.library.Fakeit
import com.mooveit.library.providers.base.BaseProvider
import com.mooveit.library.providers.definition.PhoneNumberProvider

class PhoneNumberProviderImpl : BaseProvider(), PhoneNumberProvider {

    override fun formats(): String {
        return getValue("formats") { Fakeit.fetch("phone_number.formats") }
    }
}