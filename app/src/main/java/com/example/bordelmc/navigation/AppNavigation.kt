package com.example.bordelmc.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
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
            navToHomeScreen = {},
            navToSearchScreen = {},
            navToProfileScreen = {}
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
    navToProfileScreen: () -> Unit
) {
    composable(home) {
        SearchScreen(
            navToHomeScreen = {},
            navToProfileScreen = {},
            navToSearchScreen = {}
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
            navToHomeScreen = {},
            navToSearchScreen = {},
            navToProfileScreen = {}
        )
    }
}

fun NavController.navToProfile() {
    navigate(profile)
}