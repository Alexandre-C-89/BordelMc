package com.example.bordelmc

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.bordelmc.ui.home.HomeRoute
import com.example.bordelmc.ui.quote.QuoteRoute
import com.example.bordelmc.ui.settings.SettingsRoute

@Composable
fun AppNavHost(

) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = BottomNavItem.Home.screen_route
    ) {
        composable(BottomNavItem.Home.screen_route) {
            HomeRoute(navController = navController)
        }
        composable(BottomNavItem.Quote.screen_route) {
            QuoteRoute()
        }
        composable(BottomNavItem.Settings.screen_route) {
            SettingsRoute()
        }
    }
}