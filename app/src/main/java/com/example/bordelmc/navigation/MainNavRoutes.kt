package com.example.bordelmc.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.navigation

sealed class MainNavRoutes(val routes: String) {
    object Home : MainNavRoutes("Home")
    object Quote : MainNavRoutes("quote")
    object Profile : MainNavRoutes("profile")
}

fun NavGraphBuilder.mainNavGraph(
    navController: NavHostController
) {
    navigation(
        route = Graph.MAIN_GRAPH,
        startDestination = MainNavRoutes.Home.routes
    ) {
        /**composable(route = MainNavRoutes.Home.routes) {
            HomeScreen(
                navController = navController,
                navToHomeScreen = { },
                navToProfileScreen = { },
                navToSearchScreen = { },
            )
        }*/

    }
}



