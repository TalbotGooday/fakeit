package com.mooveit.library.providers

import com.mooveit.library.Fakeit
import com.mooveit.library.providers.base.BaseProvider
import com.mooveit.library.providers.definition.BookProvider

class BookProviderImpl : BaseProvider(), BookProvider {

    override fun title(): String {
        return getValue("title") { Fakeit.fetch("book.title") }
    }

    override fun author(): String {
        return getValue("author") { Fakeit.fetch("book.author") }
    }

    override fun publisher(): String {
        return getValue("publisher") { Fakeit.fetch("book.publisher") }
    }

    override fun genre(): String {
        return getValue("genre") { Fakeit.fetch("book.genre") }
    }
}