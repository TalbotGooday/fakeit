package com.mooveit.library

import android.content.Context
import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory
import com.mooveit.library.providers.*
import com.mooveit.library.providers.definition.*
import java.util.*
import java.util.regex.Matcher
import java.util.regex.Pattern
import kotlin.collections.HashMap
import kotlin.collections.LinkedHashMap

object Fakeit {
    private const val NUMERAL_AND_BRACES_REG_EX = "#\\{(.*?)\\}"
    private const val NUMERAL_REG_EX = ".*#(\\{[^a-zA-z]|[^{])+"
    private const val NUMERAL_ONLY_REG_EX = "#"
    private const val DEFAULT_LANGUAGE = "en"

    private var uniqueValueActive = false

    private val fakeValues: LinkedHashMap<String, LinkedHashMap<String, String>> = LinkedHashMap()
    private val fakeValuesDefaults: LinkedHashMap<String, LinkedHashMap<String, String>> =
        LinkedHashMap()

    var providers = HashMap<String, Provider>()

    @JvmStatic
    fun resetLocale(context: Context, locale: Locale) {
        initWithLocale(context, locale)
    }

    @JvmStatic
    fun init(context: Context): Fakeit {
        initWithLocale(context, "en")
        return this
    }

    @JvmStatic
    fun initWithLocale(context: Context, locale: Locale) {
        initData(context, locale)
    }

    @JvmStatic
    fun initWithLocale(context: Context, localeString: String) =
        initWithLocale(context, Locale(localeString))

    @JvmStatic
    fun getUniqueValue(): Boolean = uniqueValueActive

    @JvmStatic
    fun changeUniqueValueState() {
        uniqueValueActive = uniqueValueActive.not()
    }

    private fun getProvider(key: String, provider: () -> Provider): Provider {
        return providers[key] ?: run {
            val auxProvider = provider()
            providers[key] = auxProvider
            auxProvider
        }
    }

    @JvmStatic
    fun name(): NameProvider = getProvider("name") { NameProviderImpl() } as NameProvider

    @JvmStatic
    fun business(): BusinessProvider =
        getProvider("business") { BusinessProviderImpl() } as BusinessProvider

    @JvmStatic
    fun address(): AddressProvider =
        getProvider("address") { AddressProviderImpl() } as AddressProvider

    @JvmStatic
    fun app(): AppProvider = getProvider("app") { AppProviderImpl() } as AppProvider

    @JvmStatic
    fun card(): CardProvider = getProvider("card") { CardProviderImpl() } as CardProvider

    @JvmStatic
    fun ancient(): AncientProvider =
        getProvider("ancient") { AncientProviderImpl() } as AncientProvider

    @JvmStatic
    fun artist(): ArtistProvider =
        getProvider("artist") { ArtistProviderImpl() } as ArtistProvider

    @JvmStatic
    fun bank(): BankProvider = getProvider("bank") { BankProviderImpl() } as BankProvider

    @JvmStatic
    fun beer(): BeerProvider = getProvider("beer") { BeerProviderImpl() } as BeerProvider

    @JvmStatic
    fun book(): BookProvider = getProvider("book") { BookProviderImpl() } as BookProvider

    @JvmStatic
    fun cat(): CatProvider = getProvider("cat") { CatProviderImpl() } as CatProvider

    @JvmStatic
    fun chuckNorris(): ChuckNorrisFactsProvider = getProvider(
        "chuckNorris"
    ) { ChuckNorrisFactsProviderImpl() } as ChuckNorrisFactsProvider

    @JvmStatic
    fun code(): CodeProvider = getProvider("code") { CodeProviderImpl() } as CodeProvider

    @JvmStatic
    fun company(): CompanyProvider =
        getProvider("company") { CompanyProviderImpl() } as CompanyProvider

    @JvmStatic
    fun coffee(): CoffeeProvider =
        getProvider("coffee") { CoffeeProviderImpl() } as CoffeeProvider

    @JvmStatic
    fun compass(): CompassProvider =
        getProvider("compass") { CompassProviderImpl() } as CompassProvider

    @JvmStatic
    fun dateTime(): DateTimeProvider =
        getProvider("dateTime") { DateTimeProviderImpl() } as DateTimeProvider

    @JvmStatic
    fun demographic(): DemographicProvider =
        getProvider("demographic") { DemographicProviderImpl() } as DemographicProvider

    @JvmStatic
    fun hipster(): HipsterProvider =
        getProvider("hipster") { HipsterProviderImpl() } as HipsterProvider

    @JvmStatic
    fun educator(): EducatorProvider =
        getProvider("educator") { EducatorProviderImpl() } as EducatorProvider

    @JvmStatic
    fun esports(): EsportProvider =
        getProvider("esports") { EsportProviderImpl() } as EsportProvider

    @JvmStatic
    fun internet(): InternetProvider =
        getProvider("internet") { InternetProviderImpl() } as InternetProvider

    @JvmStatic
    fun file(): FileProvider = getProvider("file") { FileProviderImpl() } as FileProvider

    @JvmStatic
    fun food(): FoodProvider = getProvider("food") { FoodProviderImpl() } as FoodProvider

    @JvmStatic
    fun friends(): FriendsProvider =
        getProvider("friends") { FriendsProviderImpl() } as FriendsProvider

    @JvmStatic
    fun gameOfThrones(): GameOfThronesProvider =
        getProvider("gameOfThrones") { GameOfThronesProviderImpl() } as GameOfThronesProvider

    @JvmStatic
    fun harryPotter(): HarryPotterProvider =
        getProvider("harryPotter") { HarryPotterProviderImpl() } as HarryPotterProvider

    @JvmStatic
    fun hacker(): HackerProvider =
        getProvider("hacker") { HackerProviderImpl() } as HackerProvider

    @JvmStatic
    fun job(): JobProvider = getProvider("job") { JobProviderImpl() } as JobProvider

    @JvmStatic
    fun lorem(): LoremProvider = getProvider("lorem") { LoremProviderImpl() } as LoremProvider

    @JvmStatic
    fun lordOfTheRings(): LordOfTheRingsProvider = getProvider(
        "lordOfTheRings"
    ) { LordOfTheRingsProviderImpl() } as LordOfTheRingsProvider

    @JvmStatic
    fun music(): MusicProvider = getProvider("music") { MusicProviderImpl() } as MusicProvider

    @JvmStatic
    fun heyArnold(): HeyArnoldProvider =
        getProvider("heyArnold") { HeyArnoldProviderImpl() } as HeyArnoldProvider

    @JvmStatic
    fun pokemon(): PokemonProvider =
        getProvider("pokemon") { PokemonProviderImpl() } as PokemonProvider

    @JvmStatic
    fun phone(): PhoneNumberProvider =
        getProvider("phone") { PhoneNumberProviderImpl() } as PhoneNumberProvider

    @JvmStatic
    fun rickAndMorty(): RickAndMortyProvider =
        getProvider("rickAndMorty") { RickAndMortyProviderImpl() } as RickAndMortyProvider

    @JvmStatic
    fun rockBand(): RockBandProvider =
        getProvider("rockBand") { RockBandProviderImpl() } as RockBandProvider

    private fun initData(context: Context, locale: Locale) {
        var stringLocale = locale.language

        if (locale.country.isNotEmpty()) {
            stringLocale = stringLocale.plus(locale.country.lowercase(Locale.getDefault()))
        }

        this.fakeValues.clear()
        this.fakeValuesDefaults.clear()

        this.fakeValues.putAll(getValues(context, stringLocale))

        if (locale.language != DEFAULT_LANGUAGE) {
            this.fakeValuesDefaults.putAll(getValues(context, DEFAULT_LANGUAGE))
        }
    }

    private fun getValues(
        context: Context,
        language: String
    ): LinkedHashMap<String, LinkedHashMap<String, String>> {
        val file = context.assets.open("raw/$language.yml")

        return run {
            val yamlValuesDefault = ObjectMapper(YAMLFactory()).readValue(
                file,
                object : TypeReference<Map<*, *>>() {}
            ) as Map<*, *>
            val localeValuesDefault = yamlValuesDefault[language] as Map<*, *>

            localeValuesDefault["faker"] as LinkedHashMap<String, LinkedHashMap<String, String>>
        }
    }

    private fun fetchCategory(
        key: String, category: String, check: Boolean,
        valuesToFetch: LinkedHashMap<String, LinkedHashMap<String, String>>
    ): LinkedHashMap<*, *> {
        val (_, subCategory, _, values) = getCategoryAndValues(
            key,
            Params(category.indexOf("."), category, check, valuesToFetch)
        )
        return when {
            values[subCategory] is LinkedHashMap<*, *> -> values[subCategory] as LinkedHashMap<*, *>
            else -> {
                val valuesList = values[subCategory] as ArrayList<LinkedHashMap<*, *>>
                valuesList[Random().nextInt(valuesList.size)]
            }
        }
    }

    private fun getCategoryAndValues(key: String, baseParams: Params): Params {
        val p =
            Params(baseParams.separator, baseParams.category, baseParams.check, baseParams.values)

        if (p.separator == -1 && p.values[p.category] == null) {
            checkAndSetParams(key, baseParams, p)
        }

        while (p.separator != -1) {
            if (p.check && p.values[p.category.substring(0, p.separator)] == null) {
                checkAndSetParams(key, baseParams, p)
            }

            p.values = p.values[p.category.substring(
                0,
                p.separator
            )] as LinkedHashMap<String, LinkedHashMap<String, String>>

            p.category = p.category.substring(p.separator + 1, p.category.length)
            p.separator = p.category.indexOf(".")
            if (p.separator == -1 && p.values[p.category] == null) {
                checkAndSetParams(key, baseParams, p)
            }
        }
        return p
    }

    private fun checkAndSetParams(key: String, baseParams: Params, params: Params) {
        if (!params.check || this.fakeValuesDefaults.size == 0) {
            throw IllegalStateException(getResourceNotFound(key))
        }
        params.separator = baseParams.category.indexOf(".")
        params.category = baseParams.category
        params.values = this.fakeValuesDefaults
        params.check = false
    }

    private fun fetchSelectedValue(key: String, category: String, selected: String): String {
        var categoryValues = fetchCategory(key, category, true, this.fakeValues)
        if (categoryValues[selected] == null) {
            if (this.fakeValuesDefaults.size == 0) {
                throw IllegalStateException(getResourceNotFound(key))
            }
            categoryValues = fetchCategory(key, category, false, this.fakeValuesDefaults)
            if (categoryValues[selected] == null) {
                throw IllegalStateException(getResourceNotFound(key))
            }
        }
        when {
            categoryValues[selected] is ArrayList<*> -> {
                val values = categoryValues[selected] as ArrayList<ArrayList<String>>
                if (values[0] is CharSequence) {
                    return getRandomString(values as ArrayList<String>)
                }
                return getRandomString(values[Random().nextInt(values.size)])
            }
            categoryValues[selected] is String -> return categoryValues[selected] as String
            else -> throw Exception("Resource $category.$selected is not a value")
        }
    }

    fun fetch(key: String): String {
        val separator = key.lastIndexOf(".")
        val category = key.substring(0, separator)
        val selected = key.substring(separator + 1, key.length)
        val selectedValue = fetchSelectedValue(key, category, selected)

        return when {
            selectedValue.matches(Regex(NUMERAL_AND_BRACES_REG_EX)) -> fetchKeyValueData(
                category,
                selectedValue
            )
            selectedValue.matches(Regex(NUMERAL_REG_EX)) -> fetchNumerals(selectedValue)
            else -> selectedValue
        }
    }

    private fun fetchNumerals(numeral: String): String {
        val stringBuffer = StringBuffer()
        return matchAndReplace(
            numeral,
            stringBuffer,
            NUMERAL_ONLY_REG_EX
        ) { matcher -> matcher.appendReplacement(stringBuffer, Random().nextInt(10).toString()) }
    }

    private fun fetchKeyValueData(category: String, selectedValue: String): String {
        val stringBuffer = StringBuffer()
        return matchAndReplace(selectedValue, stringBuffer, NUMERAL_AND_BRACES_REG_EX) { matcher ->
            matcher.appendReplacement(
                stringBuffer,
                fetchValueByCategory(category, matcher.group(1))
            )
        }
    }

    private fun fetchValueByCategory(category: String, key: String): String {
        val separator = key.lastIndexOf(".")
        var dataCategory = category
        var keyToFetch = key
        var result: String

        if (separator != -1) {
            dataCategory = key.substring(0, separator).lowercase(Locale.getDefault())
            keyToFetch = key.substring(separator + 1, key.length)
            result = fetchSelectedValue(key, dataCategory, keyToFetch)
        } else {
            val categoryValues =
                fakeValues[dataCategory] as? LinkedHashMap<String, ArrayList<String>>
                    ?: fakeValuesDefaults[dataCategory] as LinkedHashMap<String, ArrayList<String>>
            val selectedValues = categoryValues[keyToFetch] as ArrayList<String>
            result = getRandomString(selectedValues)
        }

        if (result.matches(Regex(NUMERAL_REG_EX))) {
            result = fetchNumerals(result)
        }
        if (result.matches(Regex(NUMERAL_AND_BRACES_REG_EX))) {
            result = fetchKeyValueData(dataCategory, result)
        }
        return result
    }

    private fun matchAndReplace(
        stringToMatch: String,
        stringBuffer: StringBuffer,
        regExp: String,
        method: (Matcher) -> Matcher
    ): String {
        val matcher = Pattern.compile(regExp).matcher(stringToMatch)
        while (matcher.find()) {
            method(matcher)
        }
        matcher.appendTail(stringBuffer)
        return stringBuffer.toString()
    }

    private fun getRandomString(selectedValues: ArrayList<String>): String =
        selectedValues.random()

    private fun getResourceNotFound(key: String): String = "Resource not found $key"

    data class Params(
        var separator: Int,
        var category: String,
        var check: Boolean,
        var values: LinkedHashMap<String, LinkedHashMap<String, String>>
    )
}