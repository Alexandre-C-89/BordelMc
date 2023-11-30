package com.example.bordelmc.ui.home

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import com.example.bordelmc.ui.component.AppBar
import com.example.bordelmc.ui.component.AppBottomBar
import com.example.bordelmc.ui.component.AppScaffold

@Composable
fun HomeRoute(

) {
    HomeScreen()
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(

) {
    AppScaffold(
        topBar = { AppBar() },
        bottomBar = { AppBottomBar() }
    ) {

    }
}