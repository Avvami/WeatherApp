package com.personal.weathering.domain.models.airquality

import java.time.LocalDateTime

data class CurrentAqData(
    val time: LocalDateTime,
    val europeanAqi: Int,
    val europeanAqiType: EuropeanAqType,
    val usAqi: Int,
    val usAqiType: UsAqType,
    val particulateMatter10: Double,
    val particulateMatter25: Double,
    val carbonMonoxide: Double,
    val nitrogenDioxide: Double,
    val sulphurDioxide: Double,
    val ozone: Double
)
