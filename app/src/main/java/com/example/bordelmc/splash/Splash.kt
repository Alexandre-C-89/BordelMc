package com.example.bordelmc.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.bordelmc.R
import com.example.bordelmc.navigation.AuthNavRoutes
import kotlinx.coroutines.delay

@Composable
fun Splash(
    navController: NavHostController
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            modifier = Modifier.size(width = 100.dp, height = 200.dp),
            painter = painterResource(id = R.drawable.ic_app_icon),
            contentDescription = "",
        )
        LaunchedEffect(Unit) {
            delay(1000) // Delay for 1 second
            navController.popBackStack()
            navController.navigate(route = AuthNavRoutes.Login.route) {
                popUpTo(AuthNavRoutes.Login.route)
                launchSingleTop = true
            }
        }
    }
}