package com.mooveit.library.providers

import com.mooveit.library.Fakeit
import com.mooveit.library.providers.base.BaseProvider
import com.mooveit.library.providers.definition.AppProvider

class AppProviderImpl : BaseProvider(), AppProvider {

    override fun name(): String {
        return getValue("name") { Fakeit.fetch("app.name") }
    }

    override fun version(): String {
        return getValue("version") { Fakeit.fetch("app.version") }
    }

    override fun author(): String {
        return getValue("author") { Fakeit.fetch("app.author") }
    }
}