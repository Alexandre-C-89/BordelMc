package com.example.bordelmc.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.bordelmc.home.HomeViewModel

object Graph {
    const val ROOT_GRAPH = "root_graph"
    const val AUTH_GRAPH = "auth_graph"
    const val MAIN_GRAPH = "main_graph"
}

@Composable
fun AppNavHost(
    homeViewModel: HomeViewModel? = hiltViewModel()
) {
    val navController = rememberNavController()
    //val viewModel: QuoteViewModel = hiltViewModel()
    val userExist = homeViewModel?.userExists ?: false

    NavHost(
        navController = navController,
        startDestination = if (userExist) Graph.MAIN_GRAPH else Graph.AUTH_GRAPH,
        route = Graph.ROOT_GRAPH
    ) {
        authNavGraph(navController)
        mainNavGraph(navController)
    }
}