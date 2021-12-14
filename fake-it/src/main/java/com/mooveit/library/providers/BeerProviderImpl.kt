package com.mooveit.library.providers

import com.mooveit.library.Fakeit
import com.mooveit.library.providers.base.BaseProvider
import com.mooveit.library.providers.definition.BeerProvider
import java.util.*

class BeerProviderImpl : BaseProvider(), BeerProvider {

    val rand = Random()

    override fun name(): String {
        return getValue("name") { Fakeit.fetch("beer.name") }
    }

    override fun style(): String {
        return getValue("style") { Fakeit.fetch("beer.style") }
    }

    override fun hop(): String {
        return getValue("hop") { Fakeit.fetch("beer.hop") }
    }

    override fun yeast(): String {
        return getValue("yeast") { Fakeit.fetch("beer.yeast") }
    }

    override fun malts(): String {
        return getValue("malts") { Fakeit.fetch("beer.malt") }
    }

    override fun ibu(): String {
        return getValue("ibu") {
            val randomIbu = rand.nextInt((100 - 10) + 1) + 10
            randomIbu.toString()
        }
    }

    override fun alcohol(): String {
        return getValue("alcohol") {
            val randomAlcohol = rand.nextFloat() * (10.0 - 2.0) + 2.0
            randomAlcohol.toString()
        }
    }

    override fun blg(): String {
        return getValue("blg") {
            val randomBlg = rand.nextFloat() * (20.0 - 5.0) + 5.0
            randomBlg.toString()
        }
    }
}