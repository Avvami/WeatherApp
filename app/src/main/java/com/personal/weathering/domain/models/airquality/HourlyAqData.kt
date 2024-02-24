package com.personal.weathering.domain.models.airquality

import java.time.LocalDateTime

data class HourlyAqData(
    val time: LocalDateTime,
    val europeanAqiType: EuropeanAqType,
    val usAqiType: UsAqType,
    val particulateMatter10: Double,
    val particulateMatter25: Double,
    val carbonMonoxide: Double,
    val nitrogenDioxide: Double,
    val sulphurDioxide: Double,
    val ozone: Double
)