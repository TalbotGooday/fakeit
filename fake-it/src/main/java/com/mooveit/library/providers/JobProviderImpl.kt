package com.mooveit.library.providers

import com.mooveit.library.Fakeit
import com.mooveit.library.providers.base.BaseProvider
import com.mooveit.library.providers.definition.JobProvider

class JobProviderImpl : BaseProvider(), JobProvider {

    override fun position(): String {
        return getValue("position") { Fakeit.fetch("job.position") }
    }

    override fun seniority(): String {
        return getValue("seniority") { Fakeit.fetch("job.seniority") }
    }

    override fun title(): String {
        return getValue("title") { Fakeit.fetch("job.title") }
    }

    override fun field(): String {
        return getValue("field") { Fakeit.fetch("job.field") }
    }

    override fun keySkill(): String {
        return getValue("keySkill") { Fakeit.fetch("job.key_skills") }
    }
}