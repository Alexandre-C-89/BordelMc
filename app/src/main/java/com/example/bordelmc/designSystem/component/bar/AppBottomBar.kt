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
import androidx.compose.ui.graphics.Color
import com.example.bordelmc.designSystem.theme.LightBlue
import com.example.compose.Green40
import com.example.compose.Green80

@Composable
fun AppBottomBar(
    navToHomeScreen: () -> Unit,
    navToSearchScreen: () -> Unit,
    navToProfileScreen: () -> Unit
) {
    BottomAppBar(
        backgroundColor = Green40,
        cutoutShape = CircleShape,
    ) {
        IconButton(
            onClick = { navToHomeScreen() }
        ) {
            Icon(imageVector = Icons.Default.Home, contentDescription = "Home", tint = Color.White)
        }
        IconButton(
            onClick = { navToSearchScreen() }
        ) {
            Icon(imageVector = Icons.Default.Search, contentDescription = "Search", tint = Color.White)
        }
        IconButton(
            onClick = { navToProfileScreen() }
        ) {
            Icon(imageVector = Icons.Default.AccountCircle, contentDescription = "Profile", tint = Color.White)
        }
        // Add more navigation items
    }
}