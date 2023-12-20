package com.example.bordelmc.profile

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bordelmc.designSystem.component.CardImageItem
import com.example.bordelmc.designSystem.component.ImageItem
import com.example.bordelmc.designSystem.component.InfoItemColumn
import com.example.bordelmc.designSystem.component.card.CardItem
import com.example.bordelmc.designSystem.component.bar.AppBar
import com.example.bordelmc.designSystem.component.bar.AppBottomBar
import com.example.compose.BordelMcTheme
import com.example.bordelmc.designSystem.theme.Shapes
import com.example.compose.Blue90
import com.example.compose.PurpleGray60
import com.example.compose.Teal90

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ProfileScreen(
    navToHomeScreen: () -> Unit,
    navToProfileScreen: () -> Unit,
    navToSearchScreen: () -> Unit
) {

    val context = LocalContext.current

    Scaffold(
        topBar = { AppBar() },
        bottomBar = { AppBottomBar(
            navToHomeScreen = navToHomeScreen,
            navToSearchScreen = navToSearchScreen,
            navToProfileScreen = navToProfileScreen
        ) },
        backgroundColor = PurpleGray60
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                CardImageItem(context = context)
            }
        }
    }
}

@Preview
@Composable
fun ScreenPreview() {
    BordelMcTheme {
        ProfileScreen(navToHomeScreen = { /*TODO*/ }, navToProfileScreen = { /*TODO*/ }) {

        }
    }
}