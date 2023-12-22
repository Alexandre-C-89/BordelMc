package com.example.bordelmc.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.bordelmc.home.HomeScreen
import com.example.bordelmc.profile.ProfileScreen
import com.example.bordelmc.quote.QuotesScreen
import com.example.bordelmc.quote.model.UiState

const val home = "home"

fun NavGraphBuilder.home(
    navToHomeScreen: () -> Unit,
    navToSearchScreen: () -> Unit,
    navToProfileScreen: () -> Unit
) {
    composable(home) {
        HomeScreen(
            navToHomeScreen = navToHomeScreen,
            navToSearchScreen = navToSearchScreen,
            navToProfileScreen = navToProfileScreen
        )
    }
}

fun NavController.navToHome() {
    navigate(home)
}

const val quote = "quote"

fun NavGraphBuilder.quote(
    navToHomeScreen: () -> Unit,
    navToSearchScreen: () -> Unit,
    navToProfileScreen: () -> Unit,
    //onGetQuotes : ()-> Unit,
    uiState: UiState
) {
    composable(quote) {
        QuotesScreen(
            navToHomeScreen = navToHomeScreen,
            navToSearchScreen = navToSearchScreen,
            navToProfileScreen = navToProfileScreen,
            //onGetQuotes = onGetQuotes,
            uiState = uiState
        )
    }
}

fun NavController.navToQuote() {
    navigate(quote)
}

const val profile = "profile"

fun NavGraphBuilder.profile(
    navToHomeScreen: () -> Unit,
    navToSearchScreen: () -> Unit,
    navToProfileScreen: () -> Unit
) {
    composable(profile) {
        ProfileScreen(
            navToHomeScreen = navToHomeScreen,
            navToSearchScreen = navToSearchScreen,
            navToProfileScreen = navToProfileScreen
        )
    }
}

fun NavController.navToProfile() {
    navigate(profile)
}