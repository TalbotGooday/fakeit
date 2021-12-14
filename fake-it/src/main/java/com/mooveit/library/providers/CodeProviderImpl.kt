package com.mooveit.library.providers

import com.mooveit.library.Fakeit
import com.mooveit.library.providers.base.BaseProvider
import com.mooveit.library.providers.definition.CodeProvider

class CodeProviderImpl : BaseProvider(), CodeProvider {

    override fun asin(): String {
        return getValue("asin") { Fakeit.fetch("code.asin") }
    }
}