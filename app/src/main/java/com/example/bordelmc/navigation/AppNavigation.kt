package com.example.bordelmc.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.bordelmc.UiState
import com.example.bordelmc.home.HomeScreen
import com.example.bordelmc.profile.ProfileScreen
import com.example.bordelmc.search.SearchScreen

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

const val search = "search"

fun NavGraphBuilder.search(
    navToHomeScreen: () -> Unit,
    navToSearchScreen: () -> Unit,
    navToProfileScreen: () -> Unit,
    //onGetQuotes : ()-> Unit,
    //uiState: UiState
) {
    composable(search) {
        SearchScreen(
            navToHomeScreen = navToHomeScreen,
            navToProfileScreen = navToProfileScreen,
            navToSearchScreen = navToSearchScreen,
            //onGetQuotes = onGetQuotes,
            //uiState = uiState
        )
    }
}

fun NavController.navToSearch() {
    navigate(search)
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