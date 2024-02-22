package com.example.justnote.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.bordelmc.home.HomeViewModel
import com.example.bordelmc.navigation.authNavGraph

object Graph {
    const val ROOT_GRAPH = "root_graph"
    const val AUTH_GRAPH = "auth_graph"
    const val MAIN_GRAPH = "main_graph"
}

@Composable
fun RootNavGraph(
    navController: NavHostController,
    homeViewModel: HomeViewModel? = hiltViewModel()
) {

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