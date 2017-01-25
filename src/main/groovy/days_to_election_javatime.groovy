#!/usr/bin/env groovy
import java.time.LocalDate
import java.time.Month

import static java.time.temporal.ChronoUnit.*

LocalDate electionDay = LocalDate.of(2020, Month.NOVEMBER, 3)
LocalDate now = LocalDate.now()

println "${DAYS.between(now, electionDay)} days to go..."

String pluralize(int num) {
    num == 1 ? '' : 's'
}

assert pluralize(1) == ''
(2..31).each { assert pluralize(it) == 's' }

int years  = YEARS.between(now, electionDay)
int months = MONTHS.between(now.plusYears(years), electionDay)
int days   = DAYS.between(now.plusYears(years).plusMonths(months), electionDay)
println "($years year${pluralize(years)}, $months month${pluralize(months)}, and $days day${pluralize(days)})"

assert now.plusYears(years).plusMonths(months).plusDays(days) == electionDay
