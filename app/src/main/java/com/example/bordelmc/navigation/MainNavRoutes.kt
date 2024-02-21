package com.example.bordelmc.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.example.bordelmc.home.HomeScreen
import com.example.bordelmc.profile.ProfileScreen
import com.example.bordelmc.quote.QuotesScreen
import com.example.bordelmc.quote.model.UiState

sealed class MainNavRoutes(val routes: String) {
    object Home : MainNavRoutes("Home")

    /**object NotesScreen : MainNavRoutes("Notes?{noteId}") {
    fun passNoteId(noteId: String): String {
    return "Notes?$noteId"
    }
    }*/
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
        composable(route = MainNavRoutes.Home.routes) {
            HomeScreen(
                navController = navController,
                navToHomeScreen = { },
                navToProfileScreen = { },
                navToSearchScreen = { },
            )
        }

        /**composable(
        route = MainNavRoutes.NotesScreen.routes,
        arguments = listOf(navArgument("noteId") {
        type = NavType.StringType
        })
        ) {
        NotesScreen(navController = navController)
        }*/

        composable(route = MainNavRoutes.Quote.routes) {
            QuotesScreen(
                navToHomeScreen = { },
                navToProfileScreen = { },
                navToSearchScreen = { },
                uiState = UiState()
            )
        }

        composable(route = MainNavRoutes.Profile.routes) {
            ProfileScreen(
                navToHomeScreen = {},
                navToProfileScreen = {},
                navToSearchScreen = {}
            )
        }

    }
}



