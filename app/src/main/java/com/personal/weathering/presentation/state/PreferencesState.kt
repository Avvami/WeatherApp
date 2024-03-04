package com.personal.weathering.presentation.state

data class PreferencesState(
    val searchLanguageCode: String = "en",
    val useLocation: Boolean = false,
    val useCelsius: Boolean = true,
    val useKmPerHour: Boolean = true,
    val useHpa: Boolean = true,
    val useUSaq: Boolean = true
)
