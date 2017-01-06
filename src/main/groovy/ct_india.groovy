#!/usr/bin/env groovy
import java.time.*
import java.time.format.*
LocalDate ld = LocalDate.now()
LocalTime lt = LocalTime.MIDNIGHT
ZonedDateTime zdt = ZonedDateTime.of(ld, lt, ZoneId.of('America/New_York'))
ZoneId india = ZoneId.of('Asia/Kolkata')
DateTimeFormatter dtf = DateTimeFormatter.ofPattern('hh:mma')
println "Connecticut India"
(20..30).each { 
    ZonedDateTime shifted = zdt.plusHours(it)
    println "  ${shifted.toLocalTime().format(dtf)}   ${shifted.withZoneSameInstant(india).toLocalTime()}"
}
