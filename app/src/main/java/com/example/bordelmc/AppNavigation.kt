package com.example.bordelmc

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val home = "home"

fun NavGraphBuilder.home(
    navToHomeScreen: () -> Unit,
    navToSearchScreen: () -> Unit,
    navToProfileScreen: () -> Unit
) {
    composable(home) {
        HomeScreen(
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