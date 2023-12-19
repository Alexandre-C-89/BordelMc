package com.example.bordelmc.navigation

sealed class Screen(val route: String) {
    object Home : Screen(route = "home")
    object Search : Screen(route = "search")
    object Profile : Screen(route = "profile")
    // Add more screens as needed
}