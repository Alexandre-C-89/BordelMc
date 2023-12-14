package com.example.bordelmc

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
import androidx.navigation.NavController
import androidx.navigation.NavHostController

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun HomeScreen(
    navToHomeScreen: () -> Unit,
    navToProfileScreen: () -> Unit,
    navToSearchScreen: () -> Unit
) {
    Scaffold(
        topBar = { AppBar() },
        bottomBar = {
            AppBottomBar(
                navToHomeScreen = navToHomeScreen,
                navToSearchScreen = navToSearchScreen,
                navToProfileScreen = navToProfileScreen
            )
        }
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
                Text(text = "Bienvenue sur BordelMc !")
                Text(text = "Ceci est une application où j'expérimente les bases de Compose tout comme les concepts un peu plus avancé !J'y apporte au fur et à mesure de nouvelles mise à jours que ce soit pour du contenu ou pour améliorer ce qui est en place. Au plaisir de vous voir utiliser l'app !  Alexandre")
                Spacer(modifier = Modifier.height(8.dp))
                CardItem()
            }
        }
    }
}