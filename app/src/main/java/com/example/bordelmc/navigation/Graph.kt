package com.example.justnote.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.bordelmc.home.HomeViewModel
import com.example.bordelmc.navigation.authNavGraph
import com.example.bordelmc.navigation.mainNavGraph

object Graph {
    const val MASTER_GRAPH = "master_graph"
    const val AUTH_GRAPH = "auth_graph"
    const val MAIN_GRAPH = "main_graph"
}

@Composable
fun NavHost(
    homeViewModel: HomeViewModel? = hiltViewModel()
) {
    val userExist = homeViewModel?.userExists ?: false
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = if (userExist) Graph.MAIN_GRAPH else Graph.AUTH_GRAPH,
        route = Graph.MASTER_GRAPH
    ) {
        authNavGraph(
            navController
        )
        mainNavGraph(
            navController
        )

    }
}