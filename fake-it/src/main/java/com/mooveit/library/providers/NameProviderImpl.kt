package com.mooveit.library.providers

import com.mooveit.library.Fakeit
import com.mooveit.library.providers.base.BaseProvider
import com.mooveit.library.providers.definition.NameProvider

class NameProviderImpl : BaseProvider(), NameProvider {

    override fun name(): String {
        return getValue("name") { Fakeit.fetch("name.name") }
    }

    override fun nameWithMiddle(): String {
        return getValue("nameWithMiddle") { Fakeit.fetch("name.name_with_middle") }
    }

    override fun firstName(): String {
        return getValue("firstName") { Fakeit.fetch("name.first_name") }
    }

    override fun lastName(): String {
        return getValue("lastName") { Fakeit.fetch("name.last_name") }
    }

    override fun prefix(): String {
        return getValue("prefix") { Fakeit.fetch("name.prefix") }
    }

    override fun suffix(): String {
        return getValue("suffix") { Fakeit.fetch("name.suffix") }
    }

    override fun title(): String {
        return getValue("title") { Fakeit.fetch("name.title.job") }
    }
}