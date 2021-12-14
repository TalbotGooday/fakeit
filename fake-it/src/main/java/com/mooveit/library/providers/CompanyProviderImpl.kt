package com.mooveit.library.providers

import com.mooveit.library.Fakeit
import com.mooveit.library.providers.base.BaseProvider
import com.mooveit.library.providers.definition.CompanyProvider

class CompanyProviderImpl : BaseProvider(), CompanyProvider {

    override fun suffix(): String {
        return getValue("suffix") { Fakeit.fetch("company.suffix") }
    }

    override fun buzzwords(): String {
        return getValue("buzzwords") { Fakeit.fetch("company.buzzwords") }
    }

    override fun bs(): String {
        return getValue("bs") { Fakeit.fetch("company.bs") }
    }

    override fun name(): String {
        return getValue("name") { Fakeit.fetch("company.name") }
    }

    override fun industry(): String {
        return getValue("industry") { Fakeit.fetch("company.industry") }
    }

    override fun profession(): String {
        return getValue("profession") { Fakeit.fetch("company.profession") }
    }
}