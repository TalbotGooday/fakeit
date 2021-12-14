package com.mooveit.library.providers

import com.mooveit.library.Fakeit
import com.mooveit.library.providers.base.BaseProvider
import com.mooveit.library.providers.definition.DemographicProvider

class DemographicProviderImpl : BaseProvider(), DemographicProvider {

    override fun race(): String {
        return getValue("race") { Fakeit.fetch("demographic.race") }
    }

    override fun educationalAttainment(): String {
        return getValue("educationalAttainment") { Fakeit.fetch("demographic.educational_attainment") }
    }

    override fun demonym(): String {
        return getValue("demonym") { Fakeit.fetch("demographic.demonym") }
    }

    override fun maritalStatus(): String {
        return getValue("maritalStatus") { Fakeit.fetch("demographic.marital_status") }
    }

    override fun sex(): String {
        return getValue("sex") { Fakeit.fetch("demographic.sex") }
    }
}