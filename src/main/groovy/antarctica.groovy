import java.time.Instant
import java.time.ZoneId

ZoneId.availableZoneIds
    .findAll { it ==~ /.*Antarctica.*/ }
    .collect { Instant.now().atZone(ZoneId.of(it)) }
    .sort { it.offset.totalSeconds }
    .forEach { println it }