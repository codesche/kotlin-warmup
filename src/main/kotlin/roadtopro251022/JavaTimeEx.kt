package roadtopro251022

import java.time.Duration
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

fun main() {
    val raw = "2025-10-22T08:30:00"
    val local = LocalDateTime.parse(raw)
    val seoulTime = ZonedDateTime.of(local, ZoneId.of("Asia/Seoul"))
    val utc = seoulTime.withZoneSameInstant(ZoneId.of("UTC"))

    val fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm z")
    println("Seoul: ${seoulTime.format(fmt)}")
    println("UTC : ${utc.format(fmt)}")

    // 기간 계산
    val days = Duration.between(local, local.plusDays(10)).toDays()
    println("기간(일): $days")
}