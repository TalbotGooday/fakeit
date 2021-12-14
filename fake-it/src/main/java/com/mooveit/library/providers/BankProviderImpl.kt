package com.mooveit.library.providers

import com.mooveit.library.Fakeit
import com.mooveit.library.providers.base.BaseProvider
import com.mooveit.library.providers.definition.BankProvider

class BankProviderImpl : BaseProvider(), BankProvider {

    override fun name(): String {
        return getValue("name") { Fakeit.fetch("bank.name") }
    }

    override fun swiftBic(): String {
        return getValue("swiftBic") { Fakeit.fetch("bank.swift_bic") }
    }

    override fun bankCountryCode(): String {
        return getValue("bankCountryCode") { Fakeit.fetch("bank.iban_details.bank_country_code") }
    }

    override fun ibanLetterCode(): String {
        return getValue("ibanLetterCode") { Fakeit.fetch("bank.iban_details.iban_letter_code") }
    }

    override fun ibanDigits(): String {
        return getValue("ibanDigits") { Fakeit.fetch("bank.iban_details.iban_digits") }
    }
}