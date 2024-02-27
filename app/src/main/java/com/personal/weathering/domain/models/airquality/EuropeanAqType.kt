package com.personal.weathering.domain.models.airquality

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.personal.weathering.R

sealed class EuropeanAqType(
    @StringRes val aqDescRes: Int,
    @DrawableRes val iconSmallRes: Int,
    @DrawableRes val iconLargeRes: Int
) {
    data object Good: EuropeanAqType(
        aqDescRes = R.string.good,
        iconSmallRes = R.drawable.icon_eco_fill1_wght400,
        iconLargeRes = R.drawable.icon_eco_fill0_wght200
    )
    data object Fair: EuropeanAqType(
        aqDescRes = R.string.fair,
        iconSmallRes = R.drawable.icon_sentiment_neutral_fill1_wght400,
        iconLargeRes = R.drawable.icon_sentiment_neutral_fill0_wght200
    )
    data object Moderate: EuropeanAqType(
        aqDescRes = R.string.moderate,
        iconSmallRes = R.drawable.icon_ecg_heart_fill1_wght400,
        iconLargeRes = R.drawable.icon_ecg_heart_fill0_wght200
    )
    data object Poor: EuropeanAqType(
        aqDescRes = R.string.poor,
        iconSmallRes = R.drawable.icon_masks_fill1_wght400,
        iconLargeRes = R.drawable.icon_masks_fill0_wght200
    )
    data object VeryPoor: EuropeanAqType(
        aqDescRes = R.string.very_poor,
        iconSmallRes = R.drawable.icon_sentiment_very_dissatisfied_fill1_wght400,
        iconLargeRes = R.drawable.icon_sentiment_very_dissatisfied_fill0_wght200
    )
    data object ExtremelyPoor: EuropeanAqType(
        aqDescRes = R.string.extremely_poor,
        iconSmallRes = R.drawable.icon_skull_fill1_wght400,
        iconLargeRes = R.drawable.icon_skull_fill0_wght200
    )

    companion object {
        fun fromAQI(code: Int): EuropeanAqType {
            return when(code) {
                in 0 until 21 -> Good
                in 21 until 41 -> Fair
                in 41 until 61 -> Moderate
                in 61 until 81 -> Poor
                in 81 until 101 -> VeryPoor
                else -> ExtremelyPoor
            }
        }
    }
}