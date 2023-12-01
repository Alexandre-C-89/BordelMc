package com.example.bordelmc

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItem(var title: String, var icon: ImageVector, var screen_route: String) {

    object Home: BottomNavItem("Home", Icons.Default.Home, "home")
    object Quote: BottomNavItem("Quote", Icons.Default.Email, "quote")
    object Settings: BottomNavItem("Settings", Icons.Default.Settings, "settings")

}
