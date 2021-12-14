package com.mooveit.library.providers

import com.mooveit.library.Fakeit
import com.mooveit.library.providers.base.BaseProvider
import com.mooveit.library.providers.definition.FileProvider

class FileProviderImpl : BaseProvider(), FileProvider {

    override fun extension(): String {
        return getValue("extension") { Fakeit.fetch("file.extension") }
    }

    override fun mimeType(): String {
        return getValue("mimeType") { Fakeit.fetch("file.mime_type") }
    }
}