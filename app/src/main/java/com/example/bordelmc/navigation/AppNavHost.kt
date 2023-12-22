package com.example.bordelmc.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.bordelmc.quote.QuoteViewModel

@Composable
fun AppNavHost(

) {
    val navController = rememberNavController()
    val viewModel: QuoteViewModel = hiltViewModel()

    NavHost(
        navController = navController,
        startDestination = home
    ) {
        home(
            navToHomeScreen = { navController.navigate(home) },
            navToSearchScreen = { navController.navigate(quote) },
            navToProfileScreen = { navController.navigate(profile) }
        )
        quote(
            navToHomeScreen = { navController.navigate(home) },
            navToSearchScreen = { navController.navigate(quote) },
            navToProfileScreen = { navController.navigate(profile) },
            onGetQuotes = { viewModel.getQuotes() },
            uiState = viewModel.uiState.value
        )
        profile(
            navToHomeScreen = { navController.navigate(home) },
            navToSearchScreen = { navController.navigate(quote) },
            navToProfileScreen = { navController.navigate(profile) })
        // Add more composables for other screens
    }
}