package com.mooveit.library.providers

import com.mooveit.library.Fakeit
import com.mooveit.library.providers.base.BaseProvider
import com.mooveit.library.providers.definition.EducatorProvider

class EducatorProviderImpl : BaseProvider(), EducatorProvider {

    override fun name(): String {
        return getValue("name") { Fakeit.fetch("educator.name") }
    }

    override fun secondary(): String {
        return getValue("secondary") { Fakeit.fetch("educator.secondary") }
    }

    override fun tertiaryType(): String {
        return getValue("tertiaryType") { Fakeit.fetch("educator.tertiary.type") }
    }

    override fun tertiaryCourseSubject(): String {
        return getValue("tertiaryCourseSubject") { Fakeit.fetch("educator.tertiary.course.subject") }
    }

    override fun tertiaryCourseType(): String {
        return getValue("tertiaryCourseType") { Fakeit.fetch("educator.tertiary.course.type") }
    }
}