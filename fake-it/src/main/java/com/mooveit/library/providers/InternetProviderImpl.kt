package com.mooveit.library.providers

import com.mooveit.library.Fakeit
import com.mooveit.library.providers.base.BaseProvider
import com.mooveit.library.providers.definition.InternetProvider

class InternetProviderImpl : BaseProvider(), InternetProvider {

    override fun freeEmail(): String {
        return getValue("freeEmail") { Fakeit.fetch("internet.free_email") }
    }

    override fun domainSuffix(): String {
        return getValue("domainSuffix") { Fakeit.fetch("internet.domain_suffix") }
    }
}