package com.example.bordelmc.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavHost(

) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        /**home(navToSearchScreen = { navController.navigate("search") }, navToProfileScreen = {navController.navigate("profile")}, navToHomeScreen = {navController.navigate("home")})
        search(navToHomeScreen = { navController.navigate("home") }, navToProfileScreen = {navController.navigate("profile")}, navToSearchScreen = {navController.navigate("search")})
        profile(navToHomeScreen = { navController.navigate("home") }, navToSearchScreen = {navController.navigate("search")}, navToProfileScreen = {navController.navigate("profile")})
        // Add more composables for other screens*/
    }
}