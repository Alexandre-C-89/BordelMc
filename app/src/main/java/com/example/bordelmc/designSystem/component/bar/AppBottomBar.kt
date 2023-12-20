package com.example.bordelmc.designSystem.component.bar

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.BottomAppBar
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import com.example.bordelmc.designSystem.theme.LightBlue
import com.example.compose.Green80

@Composable
fun AppBottomBar(
    navToHomeScreen: () -> Unit,
    navToSearchScreen: () -> Unit,
    navToProfileScreen: () -> Unit
) {
    BottomAppBar(
        backgroundColor = Green80,
        cutoutShape = CircleShape,
    ) {
        IconButton(
            onClick = { navToHomeScreen() }
        ) {
            Icon(imageVector = Icons.Default.Home, contentDescription = "Home")
        }
        IconButton(
            onClick = { navToSearchScreen() }
        ) {
            Icon(imageVector = Icons.Default.Search, contentDescription = "Search")
        }
        IconButton(
            onClick = { navToProfileScreen() }
        ) {
            Icon(imageVector = Icons.Default.AccountCircle, contentDescription = "Profile")
        }
        // Add more navigation items
    }
}