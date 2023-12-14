package com.example.bordelmc.profile

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.bordelmc.designSystem.component.card.CardItem
import com.example.bordelmc.designSystem.component.bar.AppBar
import com.example.bordelmc.designSystem.component.bar.AppBottomBar

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ProfileScreen(
    navToHomeScreen: () -> Unit,
    navToProfileScreen: () -> Unit,
    navToSearchScreen: () -> Unit
) {
    Scaffold(
        topBar = { AppBar() },
        bottomBar = { AppBottomBar(
            navToHomeScreen = navToHomeScreen,
            navToSearchScreen = navToSearchScreen,
            navToProfileScreen = navToProfileScreen
        ) }
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Text(text = "ProfilScreen !")
                Spacer(modifier = Modifier.height(8.dp))
                CardItem()
            }
        }
    }
}