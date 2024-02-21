package com.example.bordelmc.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.example.bordelmc.login.LoginScreen
import com.example.bordelmc.login.SignUpScreen
import com.example.bordelmc.splash.Splash


sealed class AuthNavRoutes(val route: String) {
    object Splash : AuthNavRoutes("Splash")
    object Login : AuthNavRoutes("Login")
    object SignUp : AuthNavRoutes("SignUp")
}


fun NavGraphBuilder.authNavGraph(
    navController: NavHostController
) {

    navigation(
        route = Graph.AUTH_GRAPH,
        startDestination = AuthNavRoutes.Splash.route
    ) {
        composable(
            route = AuthNavRoutes.Splash.route
        ) {
            Splash(
                navController = navController
            )
        }

        composable(route = AuthNavRoutes.SignUp.route) {
            SignUpScreen(
                navController = navController
            )
        }

        composable(route = AuthNavRoutes.Login.route) {
            LoginScreen(
                navController = navController
            )
        }


    }

}