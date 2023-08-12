package com.tanriverdi.extensions

import java.time.LocalDate
import java.time.Month

typealias LD = LocalDate

object DateContext

context(DateContext)
@DateDsl
infix fun Int.January(n: Int): LD = LD.of(n, Month.JANUARY, this)

context(DateContext)
@DateDsl
infix fun Int.February(n: Int): LD = LD.of(n, Month.FEBRUARY, this)

context(DateContext)
@DateDsl
infix fun Int.March(n: Int): LD = LD.of(n, Month.MARCH, this)

context(DateContext)
@DateDsl
infix fun Int.April(n: Int): LD = LD.of(n, Month.APRIL, this)

context(DateContext)
@DateDsl
infix fun Int.May(n: Int): LD = LD.of(n, Month.MAY, this)

context(DateContext)
@DateDsl
infix fun Int.June(n: Int): LD = LD.of(n, Month.JUNE, this)

context(DateContext)
@DateDsl
infix fun Int.July(n: Int): LD = LD.of(n, Month.JULY, this)

context(DateContext)
@DateDsl
infix fun Int.August(n: Int): LD = LD.of(n, Month.AUGUST, this)

context(DateContext)
@DateDsl
infix fun Int.September(n: Int): LD = LD.of(n, Month.SEPTEMBER, this)

context(DateContext)
@DateDsl
infix fun Int.October(n: Int): LD = LD.of(n, Month.OCTOBER, this)

context(DateContext)
@DateDsl
infix fun Int.November(n: Int): LD = LD.of(n, Month.NOVEMBER, this)

context(DateContext)
@DateDsl
infix fun Int.December(n: Int): LD = LD.of(n, Month.DECEMBER, this)

@DslMarker
annotation class DateDsl