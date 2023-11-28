package com.example.bordelmc.ui.home

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.bordelmc.ui.component.AppBar

@Composable
fun HomeRoute(

) {
    HomeScreen()
}

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(

) {
    Scaffold(
        topBar = { AppBar() }
    ) {
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            Row(modifier = Modifier.fillMaxWidth()) {

            }
        }
    }
}