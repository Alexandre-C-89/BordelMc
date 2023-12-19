package com.example.bordelmc.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.bordelmc.home.HomeScreen

@Composable
fun AppNavHost(

) {
    val navController = rememberNavController()
    //val viewModel: MainViewModel = hiltViewModel()

    NavHost(
        navController = navController,
        startDestination = home
    ) {
        home(
            navToSearchScreen = { navController.navigate("search") },
            navToProfileScreen = { Screen.Profile.route },
            navToHomeScreen = { navController.navigate("home") })
        search(
            navToHomeScreen = { navController.navigate("home") },
            navToProfileScreen = { navController.navigate("profile") },
            navToSearchScreen = { navController.navigate("search") },
            //onGetQuotes = { viewModel.getQuotes() },
            //uiState = viewModel.uiState.value
        )
        profile(
            navToHomeScreen = { navController.navigate("home") },
            navToSearchScreen = { navController.navigate("search") },
            navToProfileScreen = { navController.navigate("profile") })
        // Add more composables for other screens
    }
}