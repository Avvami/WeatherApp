package com.personal.weathering.presentation.navigation

import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.runtime.Composable
import androidx.lifecycle.Lifecycle
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.personal.weathering.presentation.MainViewModel
import com.personal.weathering.presentation.ui.screens.aq.AqScreen
import com.personal.weathering.presentation.ui.screens.weather.WeatherScreen

@Composable
fun RootNavigationGraph(
    navController: NavHostController,
    mainViewModel: MainViewModel
) {
    NavHost(
        navController = navController,
        route = RootNavGraph.ROOT,
        startDestination = RootNavGraph.WEATHER,
    ) {
        composable(
            route = RootNavGraph.WEATHER,
            enterTransition = { fadeIn() + scaleIn(initialScale = 1.2f) },
            exitTransition = { fadeOut(animationSpec = tween(durationMillis = 150)) + scaleOut(targetScale = 1.2f) }

        ) {
            WeatherScreen(
                weatherState = mainViewModel::weatherState,
                aqState = mainViewModel::aqState,
                navigateToAqScreen = { navController.navigate(RootNavGraph.AQ) }
            )
        }
        composable(
            route = RootNavGraph.AQ,
            enterTransition = { fadeIn() + scaleIn(initialScale = .8f) },
            exitTransition = { fadeOut(animationSpec = tween(durationMillis = 150)) + scaleOut(targetScale = .8f) }
        ) {
            AqScreen(
                aqState = mainViewModel::aqState,
                navigateBack = { if (navController.canGoBack) navController.popBackStack() }
            )
        }
    }
}

object RootNavGraph {
    const val ROOT = "root_graph"

    const val WEATHER = "weather_screen"
    const val AQ = "aq_screen"
}

val NavHostController.canGoBack: Boolean
    get() = this.currentBackStackEntry?.lifecycle?.currentState == Lifecycle.State.RESUMED