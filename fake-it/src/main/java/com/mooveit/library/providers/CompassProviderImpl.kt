package com.mooveit.library.providers

import com.mooveit.library.Fakeit
import com.mooveit.library.providers.base.BaseProvider
import com.mooveit.library.providers.definition.CompassProvider

class CompassProviderImpl : BaseProvider(), CompassProvider {

    override fun cardinal(): String {
        return getValue("cardinal") { Fakeit.fetch("compass.cardinal.word") }
    }

    override fun ordinal(): String {
        return getValue("ordinal") { Fakeit.fetch("compass.ordinal.word") }
    }

    override fun half_wind(): String {
        return getValue("half_wind") { Fakeit.fetch("compass.half-wind.word") }
    }

    override fun quarter_wind(): String {
        return getValue("quarter_wind") { Fakeit.fetch("compass.quarter-wind.word") }
    }

    override fun direction(): String {
        return getValue("direction") { Fakeit.fetch("compass.direction") }
    }

    override fun abbreviation(): String {
        return getValue("abbreviation") { Fakeit.fetch("compass.abbreviation") }
    }

    override fun azimuth(): String {
        return getValue("azimuth") { Fakeit.fetch("compass.azimuth") }
    }

    override fun cardinal_abbreviation(): String {
        return getValue("cardinal_abbreviation") { Fakeit.fetch("compass.cardinal.abbreviation") }
    }

    override fun ordinal_abbreviation(): String {
        return getValue("ordinal_abbreviation") { Fakeit.fetch("compass.cardinal.abbreviation") }
    }

    override fun half_wind_abbreviation(): String {
        return getValue("half_wind_abbreviation") { Fakeit.fetch("compass.half-wind.abbreviation") }
    }

    override fun quarter_wind_abbreviation(): String {
        return getValue("quarter_wind_abbreviation") { Fakeit.fetch("compass.quarter-wind.abbreviation") }
    }

    override fun cardinal_azimuth(): String {
        return getValue("cardinal_azimuth") { Fakeit.fetch("compass.cardinal.azimuth") }
    }

    override fun ordinal_azimuth(): String {
        return getValue("ordinal_azimuth") { Fakeit.fetch("compass.ordinal.azimuth") }
    }

    override fun half_wind_azimuth(): String {
        return getValue("half_wind_azimuth") { Fakeit.fetch("compass.half-wind.azimuth") }
    }

    override fun quarter_wind_azimuth(): String {
        return getValue("quarter_wind_azimuth") { Fakeit.fetch("compass.quarter-wind.azimuth") }
    }
}