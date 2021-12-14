package com.mooveit.library.providers

import com.mooveit.library.Fakeit
import com.mooveit.library.providers.base.BaseProvider
import com.mooveit.library.providers.definition.MusicProvider

class MusicProviderImpl : BaseProvider(), MusicProvider {

    private val keys = listOf("C", "D", "E", "F", "G", "A", "B")
    private val keyVariants = listOf("b", "#", "")
    private val keyTypes = listOf("", "m")
    private val chordTypes = listOf("", "maj", "6", "maj7", "m", "m7", "-7", "dom7", "dim7", "m7b5")

    override fun key(): String {
        return getValue("key") {
            keys.random() + keyVariants.random()
        }
    }

    override fun chord(): String {
        return getValue("chord") { key() + chordTypes.random() }
    }

    override fun instrument(): String {
        return getValue("instrument") { Fakeit.fetch("music.instruments") }
    }

    override fun keyTypes(): String {
        return getValue("keyTypes") { keyTypes.random() }
    }

    override fun chordTypes(): String {
        return getValue("chordTypes") { chordTypes.random() }
    }
}