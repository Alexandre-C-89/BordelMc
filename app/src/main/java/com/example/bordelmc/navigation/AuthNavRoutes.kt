package com.example.bordelmc.navigation


sealed class AuthNavRoutes(val route: String) {
    object Splash : AuthNavRoutes("Splash")
    object Login : AuthNavRoutes("Login")
    object SignUp : AuthNavRoutes("SignUp")
}


/**fun NavGraphBuilder.authNavGraph(
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

        /**composable(route = AuthNavRoutes.SignUp.route) {
            SignUpScreen(
                navController = navController
            )
        }*/

        /**composable(route = AuthNavRoutes.Login.route) {
            LoginScreen(
                navController = navController
            )
        }*/


    }

}*/